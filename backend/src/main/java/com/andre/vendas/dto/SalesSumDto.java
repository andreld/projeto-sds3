package com.andre.vendas.dto;

import java.io.Serializable;

import com.andre.vendas.entities.Seller;

public class SalesSumDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double sum;

	public SalesSumDto() {
	}

	public SalesSumDto(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
