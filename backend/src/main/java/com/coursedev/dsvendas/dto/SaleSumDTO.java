package com.coursedev.dsvendas.dto;

import java.io.Serializable;

import com.coursedev.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellername;
	private Double sum;

	public SaleSumDTO(Seller seller, Double sum) {
		sellername = seller.getName();
		this.sum = sum;
	}

	public SaleSumDTO() {};

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
