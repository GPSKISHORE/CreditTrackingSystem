package com.krish.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.krish.model.TraderLoginModel;

public interface TradeLoginJpaRepo extends JpaRepository<TraderLoginModel, String>{

	@Query("SELECT COUNT(*) FROM TraderLoginModel WHERE mobile =:mobile AND shopId =:shopId AND password =:password")
	public Long proceedAuth(String mobile,String password,String shopId);
}
