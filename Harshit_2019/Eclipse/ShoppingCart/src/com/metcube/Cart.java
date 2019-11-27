//Code Commenting ?????
package com.metcube;

public class Cart {
	
	Integer itemId;
	String productName;
	Integer productQuantity;
	Integer productPrice;
	Double totalPrice;
	public Cart(String productName, Integer productQuantity,
			Integer productPrice, Double totalPrice,Integer itemId) {
		super(); //Why????
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
		this.totalPrice = totalPrice;
		this.itemId=itemId; //White Spacing ?????
	}
}
