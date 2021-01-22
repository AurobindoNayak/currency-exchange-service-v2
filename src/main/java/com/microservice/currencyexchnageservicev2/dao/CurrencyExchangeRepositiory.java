package com.microservice.currencyexchnageservicev2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.currencyexchnageservicev2.entity.ExchangeValue;


@Repository
public interface CurrencyExchangeRepositiory extends JpaRepository<ExchangeValue, Integer> {
	
	public ExchangeValue save(ExchangeValue exchangeValue);
	 
	
	public ExchangeValue findByFromAndTo(String from, String to);

}
