package updated;

import java.util.Scanner;

/**
* Author: HARSHIT kASLIWAL
* Since: JULY.15,2019	
* Name: Area
* Description: This class is used to calculate area of different shapes on provided width height and radius so we can compare them.
**/
public class Area extends ArithmeticException{
	/**
	* Name: areaTriangle
	* Description: to calculate area of triangle
	* @param:  (1) width - double - width of triangle-always positive
	(2)  height- double - height of triangle-always positive
	* @return: Type - double
	*  usage:return area of triangle 
	**/
	public double areaTriangle(double width,double height)throws ArithmeticException{	
	    try{
		//return 0.5*(width/height);
	    	String s="abc";  
	    	int i=Integer.parseInt(s);
	    	return 5/0;
	    }  catch(ArithmeticException ae){
	    	System.out.println("areaTriangle" + ae.getMessage());
	    	throw new ArithmeticException("exception");
	    }  catch(NumberFormatException ne) {
	    	System.out.println("areaTriangle ne " + ne.getMessage());
	    }
	    return 0;
	}
	
	
	/**
	* Name: areaSquare
	* Description: to calculate area of Square
	* @param:  (1) width - double - width of Square-always positive
	* @return: Type - double-always positive
	*  usage:return area of Square
	**/
	public double areaSquare(double width)throws ArithmeticException{
		try{
		return width*width;
		}
		catch(ArithmeticException ae){
			System.out.println("areaSquare" + ae.getMessage());
			throw new ArithmeticException();
		}
	}
	
	
	/**
	* Name: areaReactAngle
	* Description: to calculate area of Rectangle
	* @param:  (1) width - double - width of Rectangle-always positive
	(2)  height- double - height of Rectangle-always positive
	* @return: Type - double
	*  usage:return area of Rectangle
	**/
	public double areaRectAngle(double width,double height ) throws  ArithmeticException{
		   try{
			return width*height;
		   }
		   catch(ArithmeticException ae){
			   System.out.println("areaRectAngle" + ae.getMessage());
			   throw new ArithmeticException();
		   }
	}
	
	/**
	* Name: areaCircle
	* Description: to calculate area of Circle
	* @param:  (1) radius-integer-radius of circle-always positive
	* @return: Type - double
	*  usage:return area of circle
	**/
	public double areaCircle(double radius) throws ArithmeticException {
		try{
		return (3.141)*(radius*radius);
		}
		catch(ArithmeticException ae){
			System.out.println("areaCircle" + ae.getMessage());
			throw new ArithmeticException();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter width heigth radius for area");
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		double radius=sc.nextDouble();
		while((width<=0)||(height<=0)||(radius<=0)){
			System.out.println("sides can not be negetive or zero");
	        System.out.println("try again");
	        System.out.println("enter width heigth radius for area");
			 width=sc.nextDouble();
			 height=sc.nextDouble();
			 radius=sc.nextDouble();
	        
		}
	
		Area obj=new Area();
		
		try {
			System.out.println("Area of circle is:"+obj.areaCircle(radius));
			System.out.println("Area of ractangle is:"+obj.areaRectAngle(width, height));
			System.out.println("Area of triangle is:"+obj.areaTriangle(width, height));
			System.out.println("Area of square is:"+obj.areaSquare(width));
			} 
		  catch (ArithmeticException e) {
			  System.out.println("main" + e.getMessage());
		}
		
	}
}
