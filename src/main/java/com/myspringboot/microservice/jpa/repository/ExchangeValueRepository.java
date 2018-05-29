package com.myspringboot.microservice.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspringboot.microservice.entity.ExchangeValue;

@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	ExchangeValue findByFromAndTo(String from, String to);
}
