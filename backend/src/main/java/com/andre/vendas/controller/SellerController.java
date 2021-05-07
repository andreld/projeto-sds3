package com.andre.vendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andre.vendas.service.SellerService;
import com.andre.vendas.dto.SellerDto;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	@Autowired
	SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDto>> findAll(){
		return ResponseEntity.ok(service.findAll());
	}
}
