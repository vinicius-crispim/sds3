package com.coursedev.dsvendas.dto;

import java.io.Serializable;

import com.coursedev.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellername;
	private Long visted;
	private Long deals;

	
	public SaleSuccessDTO(Seller seller, Long visted, Long deals) {
		sellername = seller.getName();
		this.visted = visted;
		this.deals = deals;
	}

	public SaleSuccessDTO() {};

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public Long getVisted() {
		return visted;
	}

	public void setVisted(Long visted) {
		this.visted = visted;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

}
