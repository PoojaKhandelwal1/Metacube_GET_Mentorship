//TODO should use Interface 
//Indentation & spacing
//Menu driven

import java.util.Scanner;

/**
* Author: HARSHIT kASLIWAL
* Since: JULY.15,2019	
* Name: Area
* Description: This class is used to calculate area of different shapes on provided width height and radius so we can compare them.
**/
public class Area {
	/**
	* Name: areaTriangle
	* Description: to calculate area of triangle
	* @param:  (1) width - double - width of triangle
	(2)  height- double - height of triangle
	* @return: Type - double
	*  usage:return area of triangle 
	**/
	public double areaTriangle(double width,double height){
			return 0.5*(width*height);
		}
	
	
	/**
	* Name: areaSquare
	* Description: to calculate area of Square
	* @param:  (1) width - double - width of Square
	* @return: Type - double
	*  usage:return area of Square
	**/
	public double areaSquare(double width){
		return width*width;
	}
	
	/**
	* Name: areaReactAngle
	* Description: to calculate area of Rectangle
	* @param:  (1) width - double - width of Rectangle - 
	(2)  height- double - height of Rectangle
	* @return: Type - double
	*  usage:return area of Rectangle
	**/
	public double areaRectAngle(double width,double height ){
			return width*height;
	}
	/**
	* Name: areaCircle
	* Description: to calculate area of Circle
	* @param:  (1) radius-integer-radius of circle
	* @return: Type - double
	*  usage:return area of circle
	**/
	public double areaCircle(double radius){
		return (3.141)*(radius*radius);
	}
  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter width heigth radius for area");
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		double radius=sc.nextDouble();
		Area obj=new Area();
		
		System.out.println("Area of circle is:"+obj.areaCircle(radius));
		System.out.println("Area of ractangle is:"+obj.areaRectAngle(width, height));
		System.out.println("Area of triangle is:"+obj.areaTriangle(width, height));
		System.out.println("Area of square is:"+obj.areaSquare(width));
		
	}
}
