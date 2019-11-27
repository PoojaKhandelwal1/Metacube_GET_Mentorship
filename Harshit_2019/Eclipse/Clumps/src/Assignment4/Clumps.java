package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Author: Harshit Kasliwal
* Since: July. 16, 2019
* Name: Clumps
* Description: This class used to find no clumps in array.Clump in an array is a series of 2 or more adjacent elements of the same value. 
**/
public class Clumps {
	/**
	* Name: countClumps
	* Description: to count no of clumps in an given array.
	* @param:  (1) arr-array-integer array given by user
	           (2)  size-integer-size of given array
	* @return: Type - integer
	*  usage:return count of clumps in the array
	**/
	 public static int countClumps(int arr[]) {
			if(arr.length<1){
				try{
			throw new AssertionError();
				}
				catch(AssertionError e){
					System.out.println("array size should be at least one");
					return 0;
				}
			}
		int current = -1; 
		int clump_count = 0;
		for(int i = 0; i < arr.length - 1; i++) 
		{
			if(arr[i] == arr[i + 1] && arr[i] != current) 
			{
				current = arr[i];
				clump_count++;
			} 
			else 
			{
				if(arr[i] != current) 
					{
					current = -1;
					}
			}
		}
	  return clump_count;
	}
	
	
	public static void main(String[] args)
	{
		int size= 0;
		Scanner input= new Scanner(System.in);
		try{
		
			System.out.println("enter size of array");
			size= input.nextInt();
			}
		 catch(InputMismatchException ae)
		   {
			 System.out.println("size must be a number");
			 System.out.println("give another size");
			 input.nextLine();
			 size= input.nextInt();
	      }
		 if(size<=0)
			{
				System.out.println("size can not be negetive or zero");
				System.out.println("enter non negetive size for array");
				size= input.nextInt();
			}
			int array[] = new int[size];
			System.out.println("enter element in array");
			for(int i= 0;i<size;i++)
			{
			array[i]= input.nextInt();
			}
			Clumps obj= new Clumps();
			System.out.println("no of clumps in the array is: "+obj.countClumps(array));
			
			input.close();
	}
}
