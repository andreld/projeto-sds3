package com.andre.vendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andre.vendas.dto.SaleDto;
import com.andre.vendas.dto.SalesSuccessDto;
import com.andre.vendas.dto.SalesSumDto;
import com.andre.vendas.entities.Sale;
import com.andre.vendas.repositories.SaleRepository;
import com.andre.vendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository saleRepository;
	
	@Autowired
	SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDto> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> page = saleRepository.findAll(pageable);
		return page.map(s -> new SaleDto(s));
	}
	
	@Transactional(readOnly = true)
	public List<SalesSumDto> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SalesSuccessDto> successGroupedBySeller(){
		return saleRepository.successGroupedBySeller();
	}
}
