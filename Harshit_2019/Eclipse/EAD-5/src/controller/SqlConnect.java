package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;

public class SqlConnect {
	  Connection conn;
	  Statement stmt;
	  ResultSet rs;
	  
	  
	 public void loadDb(){
		 try{
		   	  conn = new DbConnect().getConnection();
		   	  stmt = null;
		 	  stmt = conn.createStatement();
	 		}
	 catch(Exception e){
		 e.printStackTrace();
		 System.out.println("error while connecting  in loadDb()");
	 	}
	
	 }
	 
	 public ArrayList<Product> selectAllProduct(){
		 ArrayList<Product> list = new ArrayList();
		 loadDb();
		 String sql = "select * from Product";
		 try{
			 	rs = stmt.executeQuery(sql);
			 	while(rs.next()){
			    	
			 			int pId = rs.getInt(1);
			 			int pPrice = rs.getInt(2);
			 			String pName = rs.getString(3);
			    	    list.add(new Product(pId, pName, pPrice));
			 			System.out.println("id is"+ pId + " name is "+ pName+" price is "+pPrice);
			 		}
		 		}
		 
		 catch(Exception e){
			 	System.out.println("error while selecting all data from product");
		 }
		return list;
		 
   }
	 public ArrayList<Product> selectProduct(int id){
		 ArrayList<Product> cart = new ArrayList();
		 loadDb();
		 String sql = "select * from Product where product_id ="+id+" ";
		 try{
			 	rs = stmt.executeQuery(sql);
			 	while(rs.next()){
			    	
			 			int pId = rs.getInt(1);
			 			int pPrice = rs.getInt(2);
			 			String pName = rs.getString(3);
			    	    //list.add(new Product(id, name, price));
			 			System.out.println("id is"+ pId + " name is "+ pName+" price is "+pPrice);
			 			cart.add(new Product(pId, pName, pPrice));
			 		}
			 	
		 		}
		 
		 catch(Exception e){
			 	System.out.println("error while selecting all data from product");
		 }
		return cart;
		 
   }
	 
	 

}
