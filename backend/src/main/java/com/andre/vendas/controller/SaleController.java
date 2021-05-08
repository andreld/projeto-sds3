package com.andre.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.vendas.dto.SaleDto;
import com.andre.vendas.dto.SalesSuccessDto;
import com.andre.vendas.dto.SalesSumDto;
import com.andre.vendas.service.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
		return ResponseEntity.ok(saleService.findAll(pageable));
	}
	
	@GetMapping("/amount-by-seller")
	public ResponseEntity<List<SalesSumDto>> amountGroupedBySeller(){
		return ResponseEntity.ok(saleService.amountGroupedBySeller());
	}
	
	@GetMapping("/success-by-seller")
	public ResponseEntity<List<SalesSuccessDto>> successGroupedBySeller(){
		return ResponseEntity.ok(saleService.successGroupedBySeller());
	}
}
