package model;

public class Cart {
	
	private int pId;
	private String pName;
	private int pPrice;
	private int quantity;
	
	
	public Cart(int pID,String pName,int pPrice,int quantity){
		
		  this.pId = pId;
		  this.pName = pName;
		  this.pPrice = pPrice;
		  this.quantity = quantity;
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
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
