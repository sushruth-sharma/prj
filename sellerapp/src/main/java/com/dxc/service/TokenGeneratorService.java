package com.dxc.service;

import java.util.Map;


import com.dxc.model.Seller;

public interface TokenGeneratorService {

	Map<String,String> generateToken(Seller seller);
}
