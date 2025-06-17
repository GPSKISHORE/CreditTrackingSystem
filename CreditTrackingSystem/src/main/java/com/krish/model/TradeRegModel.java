package com.krish.model;

import java.sql.Blob;

import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TRADE_MASTER")
public class TradeRegModel {

	@Id
	@Column(name = "LoginId")
	@Nonnull
	private String mobile;
	@Column(name = "ShopId")
	@Nonnull
	private String shopId;
	@Column(name = "Password")
	private String password;
	@Nonnull
	@Column(name = "Trader_Name", length = 50)
	private String tradername;
	@Column(name = "Catelog")
	private String catogery;
	@Column(name = "Shop_Location", length = 250)
	private String shoplocation;
	@Column(name = "PIN_CODE")
	private String pincode;
	@Column(name = "ADDR1")
	private String addressline1;
	@Column(name = "ADDR2")
	private String addressline2;
	@Column(name = "ADDR3")
	private String addressline3;
	@Column(name = "STATE")
	private String state;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "SHOP_IMAGES")
	@Lob
	private Blob shopphoto;
	@Column(name = "LICENCE_TYPE")
	private String licencetype;
	@Column(name = "LICENCE_IMAGE")
	private String licence;
	@Transient
	public MultipartFile photo;
	@Transient
	public MultipartFile file;
	
	
}
