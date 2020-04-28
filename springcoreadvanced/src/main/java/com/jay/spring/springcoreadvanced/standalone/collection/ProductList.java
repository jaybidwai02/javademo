package com.jay.spring.springcoreadvanced.standalone.collection;

import java.util.List;

public class ProductList {
	private List<String> productList;

	@Override
	public String toString() {
		return "ProductList [productList=" + productList + "]";
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
}
