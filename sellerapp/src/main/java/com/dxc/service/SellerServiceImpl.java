package com.dxc.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.SellerExistsException;
import com.dxc.exception.SellerNotFoundException;
import com.dxc.model.Seller;
import com.dxc.repo.SellerRepository;

@Service

public class SellerServiceImpl implements SellerService {
	
	@Autowired
	
	private SellerRepository sellerrepository;
	
	@Override
	
	public Seller registerSeller(Seller seller) throws SellerExistsException {
		final Boolean existById = this.sellerrepository.existsById(seller.getSellerid());
		if(existById) {
			throw new SellerExistsException("Seller Already Exists");
		}
		return this.sellerrepository.save(seller);
	}
	
	@Override
	
	public Seller authenticateSeller(String selleremail, String sellerpassword)
			throws SellerNotFoundException, IncorrectPasswordException {
		final Optional<Seller> optionalSeller = this.sellerrepository.findBySelleremailAndSellerpassword(selleremail, sellerpassword);
		
		if(optionalSeller.isEmpty())
		{
			throw new SellerNotFoundException();
		}
		return optionalSeller.get();
	}
}
