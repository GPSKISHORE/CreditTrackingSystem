package com.krish.service;

import com.krish.model.TradeRegModel;
import com.krish.model.TraderLoginModel;

public interface ITradeService {

	public boolean authentication(TraderLoginModel tlm);
	public boolean checkLoginId(String login);
	public String newRegistration(TradeRegModel reg);
}
