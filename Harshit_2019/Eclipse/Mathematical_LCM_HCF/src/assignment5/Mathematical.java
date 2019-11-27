package assignment5;

import java.util.Scanner;

/**
* Author: Harshit Kasliwal
* Since: July. 19, 2019
* Name: Mathematical
* Description: This class used calculate lcm and hcf of two given numbers. 
**/
public class Mathematical {


	public static void main(String[] args) {
		
	     int first;
	     int second;
		Scanner input = new Scanner(System.in);
		System.out.println("enter two numbers to calculate lcm or hcf");
		 first = input.nextInt();
	     second = input.nextInt();
		
		System.out.println("enter choice what you want to calulate");
		System.out.println("press 1 for LCM");
		System.out.println("press 2 for HCF");
		System.out.println("press 3 for both");
		 int choice= input.nextInt();
		
		switch(choice){
		case 1:
			int lcm=  new Mathematical().calculateLcm(first,second);
			System.out.println("lcm of given no is " + lcm);
			   	break;
		case 2:
			  int hcf= new Mathematical().calculateHcf(first,second);
			  System.out.println("hcf of given no is" + hcf);
			     break;
			     
		case 3:
			 int ans_hcf= new Mathematical().calculateHcf(first,second);
			 int ans_lcm=  new Mathematical().calculateLcm(first,second);
			 System.out.println("lcm of given no is "+ans_lcm);
			 System.out.println("hcf of given no is "+ans_hcf);
			 break;
			    
		}
	}

	/**
	* Name: calculateHcf
	* Disc: used to calculate hcf of two given numbers. 
	* @param:  (1) first- integer - first number provided by user-always positive
	*          (2) second-integer - second no provided by user-always positive
	* @return: integer - return hcf of given two numbers
	**/
	public  int calculateHcf(int first,int second) {
		     if(second== 0){
		    	 return first;
		     }
		     else{
		    	 return calculateHcf(second,first%second);
		     }
		
	}
    int i= 1;

	/**
	* Name: calculateLcm
	* Disc: used to calculate lcm of two given numbers. 
	* @param:  (1) first- integer - first number provided by user-always positive
	*          (2) second-integer - second no provided by user-always positive
	* @return: integer - return lcm of given two numbers
	**/
	public  int calculateLcm(int first,int second) {
		 if(first%second== 0)
		        return first;
		     else
		        return calculateLcm(first+first/i++,second);
		
	}
}
