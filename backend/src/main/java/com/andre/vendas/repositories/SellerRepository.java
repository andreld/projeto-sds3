package com.andre.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andre.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
