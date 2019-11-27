package model;

public class Customer {
  private int cID;
  private String cName;
  
  public Customer(int cId,String cName){
	  this.setcID(cId);
	  this.setcName(cName);
  }

/**
 * @return the cID
 */
public int getcID() {
	return cID;
}

/**
 * @param cID the cID to set
 */
public void setcID(int cID) {
	this.cID = cID;
}

/**
 * @return the cName
 */
public String getcName() {
	return cName;
}

/**
 * @param cName the cName to set
 */
public void setcName(String cName) {
	this.cName = cName;
}
}
