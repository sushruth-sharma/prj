package com.dxc.service;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.SellerExistsException;
import com.dxc.exception.SellerNotFoundException;
import com.dxc.model.Seller;

public interface SellerService {
   
	Seller registerSeller(Seller seller) throws SellerExistsException;
	
	
	Seller authenticateSeller(String selleremail,String sellerpassword)throws SellerNotFoundException,IncorrectPasswordException;

	
}
