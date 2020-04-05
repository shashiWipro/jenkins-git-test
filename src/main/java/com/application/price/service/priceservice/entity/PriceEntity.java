package com.application.price.service.priceservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "PriceEntity")
public class PriceEntity {
	@ApiModelProperty(notes = "priceId of the Price",name="priceId",required=false,value="test name")
    @Id
	private Integer priceId;
	@ApiModelProperty(notes = "priceId of the productId",name="productId",required=true,value="productId")
	private String productId;
	@ApiModelProperty(notes = "price of the Price",name="price",required=true,value="price")
	private Double price;
	
	@Transient
	private int port;
	public PriceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriceEntity(Integer priceId, String productId, Double price,int port) {
		super();
		this.priceId = priceId;
		this.productId = productId;
		this.price = price;
		this.port=port;
	}
	public PriceEntity(Integer priceId, String productId, Double price) {
		super();
		this.priceId = priceId;
		this.productId = productId;
		this.price = price;
		
	}
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "PriceEntity [priceId=" + priceId + ", productId=" + productId + ", price=" + price + "]";
	}
	
	
	
}
