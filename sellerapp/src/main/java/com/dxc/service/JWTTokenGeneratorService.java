package com.dxc.service;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.stereotype.Service;

import com.dxc.model.Seller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@SuppressWarnings("unused")
@Service
public class JWTTokenGeneratorService implements TokenGeneratorService  {
	
	@Value("${jwt.secret.key}")
	private String secretKey;

	@Override
	public Map<String, String> generateToken(Seller seller) {
		String token = Jwts.builder().setSubject(seller.getSelleremail())
		.setIssuer("BuyerPageIssuer")
		.setIssuedAt(new Date())
		.signWith(SignatureAlgorithm.HS256, secretKey)
		.compact();
		return Map.of("token",token);
	}

}