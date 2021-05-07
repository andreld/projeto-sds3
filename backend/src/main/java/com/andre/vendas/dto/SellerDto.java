package com.andre.vendas.dto;

import com.andre.vendas.entities.Seller;

public class SellerDto {
	
	private Long id;
	private String name;
	
	public SellerDto() {
		
	}
	
	public SellerDto(Seller seller) {
		id = seller.getId();
		name = seller.getName();
	}

	public SellerDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
