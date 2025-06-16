package com.krish.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Random;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.krish.model.TradeRegModel;
import com.krish.model.TraderLoginModel;
import com.krish.repo.TradeLoginJpaRepo;
import com.krish.repo.TraderRegModel;

@Service
public class TradeService implements ITradeService{

	@Autowired
	private TradeLoginJpaRepo trepo;
	@Autowired
	private TraderRegModel trm;
	
	@Override
	public boolean authentication(TraderLoginModel tlm) {
		return trepo.proceedAuth(tlm.getMobile(), tlm.getPassword(), tlm.getShopId())>0;
	}

	@Override
	public boolean checkLoginId(String login) {
		Optional<TraderLoginModel> opt = trepo.findById(login);
		if(opt.isPresent())
			return true;
		return false;
	}
	
	@Autowired
	private Environment env;

	@Override
	public String newRegistration(TradeRegModel reg) {
		int randomNum = new Random().nextInt(100000,999999);
		String shop_id = "";
		while(randomNum>=100000) {
			shop_id = reg.getPincode()+randomNum;
			Long count = trm.chkShopId(shop_id);
			if(count<1)
				break;
		}
		reg.setShopId(shop_id);
		MultipartFile img = reg.getPhoto();
		MultipartFile doc = reg.getFile();
		Blob imgConvert = null;
		
		String file = env.getProperty("TraderDoc.location");
		File f = new File(file);
		if(!f.exists())
			f.mkdir();
		
		String doc_path = f.getAbsolutePath()+"\\"+(shop_id+"_"+reg.getCatogery()+img.getOriginalFilename());
		System.out.println(img.getOriginalFilename()+" <<--");
		try(InputStream is = doc.getInputStream();
			OutputStream os = new FileOutputStream(doc_path)){
			IOUtils.copy(is, os);
			if(img !=null && !img.isEmpty())
				imgConvert = new SerialBlob(img.getBytes());
			else
				System.out.println("Img is empty");
		}catch(IOException e) {
			e.printStackTrace();
		} catch (SerialException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		reg.setLicence(doc_path);
		reg.setShopphoto(imgConvert);
		return "Please note the shop id - "+trm.save(reg).getShopId()+" for future reference and login";
	}

	
}
