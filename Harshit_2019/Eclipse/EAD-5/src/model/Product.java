package model;

public class Product {
	/**
	* Author: Harshit Kasliwal
	* Since: September. 03, 2019
	* Name: Product
	* Description: POJO class for product 
	**/
	private int pId;
	private String pName;
	private int pPrice;
	
	public Product(int pID,String pName,int pPrice){
		
		  this.pId = pId;
		  this.pName = pName;
		  this.pPrice = pPrice;
	}
	
	/**
	 * @return the pPrice
	 */
	public int getpPrice() {
		return pPrice;
	}
	/**
	 * @param pPrice the pPrice to set
	 */
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	/**
	 * @return the pName
	 */
	public String getpName() {
		return pName;
	}
	/**
	 * @param pName the pName to set
	 */
	public void setpName(String pName) {
		this.pName = pName;
	}
	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}
	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}


}
