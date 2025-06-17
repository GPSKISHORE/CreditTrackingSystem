package com.krish.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.krish.model.TradeRegModel;

public interface TraderRegModel extends JpaRepository<TradeRegModel, String>{

	@Query("SELECT COUNT(*) FROM TradeRegModel WHERE shopId=:sid")
	public Long chkShopId(@Param("sid") String shopId);
}
