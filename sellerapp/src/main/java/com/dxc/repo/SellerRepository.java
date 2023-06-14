package com.dxc.repo;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.Seller;

@Repository

public interface SellerRepository extends JpaRepository<Seller,Boolean>{
   
	Optional<Seller> findBySelleremailAndSellerpassword(String Selleremail,String Sellerpassword);
}
