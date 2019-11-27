package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Product;


public class DbConnect {
	  public static Connection conn;
	 public static Connection getConnection() throws Exception{
		 try{
			 String url = "jdbc:mysql://localhost:3306/shoppingCart";	
			 Class.forName("com.mysql.jdbc.Driver");
			 System.out.println("class loaded");
			 conn =  DriverManager.getConnection(url,"root","root");
			 System.out.println("connection established");
			 return conn;
		 }
		 catch(Exception ex){
				System.out.println("Ërror in connection");
				ex.printStackTrace();
				  return null;
			}
		 
	 }
	 
	 public static void main(String[] args) throws Exception {
	/*	Connection conn = new DbConnect().getConnection();
		String sql ="select * from product";
		Statement stmt = null;
	    stmt = conn.createStatement();
	     
	    ResultSet rs = stmt.executeQuery(sql);
	    while(rs.next()){
	    	
	    	int id = rs.getInt(1);
	    	int price = rs.getInt(2);
	    	String name = rs.getString(3);
	    	
	    	System.out.println("id is"+ id + " name is "+ name+" price is "+price);
	
	    }
	    */
		 
		ArrayList <Product> list = new SqlConnect().selectAllProduct();
		
		for(int i=0;i<list.size();i++){
			System.out.println("id is "+list.get(i).getpId());

			System.out.println("name is "+list.get(i).getpName());
			System.out.println("price is "+list.get(i).getpPrice());
		}
		// new SqlConnect().selectProduct(2);
	    
		
		
	}
}
