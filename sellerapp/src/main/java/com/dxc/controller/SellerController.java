package com.dxc.controller;

import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.SellerExistsException;
import com.dxc.exception.SellerNotFoundException;
import com.dxc.model.Seller;
import com.dxc.model.SellerCredential;
import com.dxc.service.SellerService;
import com.dxc.service.TokenGeneratorService;

@RestController
@RequestMapping("sellers")

public class SellerController {
	@Autowired
	private SellerService service;
	@Autowired
	private TokenGeneratorService tokenGenerator;
	
	@PostMapping("register")
	public Seller registerSeller(@RequestBody Seller seller) throws SellerExistsException {
		return this.service.registerSeller(seller);
	}
		
	@PostMapping("login")
	public Map<String,String> authenticateSeller(@RequestBody SellerCredential credentials ) throws SellerNotFoundException, IncorrectPasswordException
	{
       
	  final	Seller seller = this.service.authenticateSeller(credentials.getSelleremail(), credentials.getSellerpassword());
	
	return this.tokenGenerator.generateToken(seller);
		
}
}