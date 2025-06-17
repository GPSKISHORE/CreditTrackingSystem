package com.krish.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
	
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CUST_MASTER")
public class CustLoginModel {

	@Id
	@Column(name = "LoginId")
	private String mobile;
	@Column(name = "Password")
	private String password;
}
