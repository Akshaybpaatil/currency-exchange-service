package com.practice.express.currencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.express.currencyexchangeservice.model.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {

	ExchangeValue findByFromAndTo(String from,String to);
}
