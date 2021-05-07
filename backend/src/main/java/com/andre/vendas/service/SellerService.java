package com.andre.vendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andre.vendas.entities.Seller;
import com.andre.vendas.repositories.SellerRepository;
import com.andre.vendas.dto.SellerDto;

@Service
public class SellerService {

	@Autowired
	SellerRepository repository;

	public List<SellerDto> findAll() {
		List<Seller> sellers = repository.findAll();
		return sellers.stream().map(s -> new SellerDto(s)).collect(Collectors.toList());
	}
}
