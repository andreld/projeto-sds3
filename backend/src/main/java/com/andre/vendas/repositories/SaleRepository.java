package com.andre.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.andre.vendas.dto.SalesSuccessDto;
import com.andre.vendas.dto.SalesSumDto;
import com.andre.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.andre.vendas.dto.SalesSumDto(sale.seller, SUM(sale.amount))"
			+ " FROM Sale AS sale GROUP BY sale.seller")
	public List<SalesSumDto> amountGroupedBySeller();
	
	@Query("SELECT new com.andre.vendas.dto.SalesSuccessDto(sale.seller, SUM(sale.visited), SUM(sale.deals))"
			+ " FROM Sale AS sale GROUP BY sale.seller")
	public List<SalesSuccessDto> successGroupedBySeller();
}
