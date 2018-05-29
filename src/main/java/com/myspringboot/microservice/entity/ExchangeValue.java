/**
 * 
 */
package com.myspringboot.microservice.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 30069
 *
 */
@Entity
public class ExchangeValue {
	
	@Id
	private Long id;

	@Column(name="exchange_from")
	private String from;
	
	@Column(name="exchange_to")
	private String to;
	
	private BigDecimal conversionMulitple;
	
	private int port;
	
	public ExchangeValue() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMulitple() {
		return conversionMulitple;
	}

	public void setConversionMulitple(BigDecimal conversionMulitple) {
		this.conversionMulitple = conversionMulitple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMulitple, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMulitple = conversionMulitple;
		this.port = port;
	}

}
