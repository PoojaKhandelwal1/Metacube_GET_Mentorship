package Assignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Author: Harshit Kasliwal
* Since: July. 16, 2019
* Name: SplitArray
* Description: This class used to split an array such that sum of left sub array is equal to sum of right sub array. 
**/
public class SplitArray {

	/**
	* Name: splitArray
	* Disc: used to split an array such that sum of left sub array is equal to sum of right sub array. 
	* @param:  (1) array- Array - 
	* @return: integer - return index where we can split array into two sub array whose sum are equal- -1 if not possible
	**/
	public static int spiltArray(int[] array){
		if(array.length<1){
			try{
		throw new AssertionError();
			}
			catch(AssertionError e){
				System.out.println("Array size should be at least one");
				return 0;
			}
		}
			int leftsum= 0;
			int rightsum= 0;
			//computing total sum of array 
			for(int loop1= 0;loop1<array.length;loop1++)
				{
					leftsum+= array[loop1];
				}
			for(int index= array.length-1;index>=0;index--)
			{
					//add current element to right sum
					rightsum+= array[index];
					//calculating left sum by excluding current element 
					leftsum-= array[index];
					if(leftsum == rightsum){
						return index;
			}
			  
		}
		
		return -1;
	}
	public static void main(String[] args)
	{
			int size= 0;
			Scanner input= new Scanner(System.in);
		try{
			
			System.out.println("enter size of array");
			size= input.nextInt();
		  }
		catch(InputMismatchException ae){
			System.out.println("size must be a number");
			System.out.println("give another size");
			input.nextLine();
			size=input.nextInt();
		  }
			if(size<= 0){
					System.out.println("size can not be negetive");
					System.out.println("enter non negetive size for array");
					size=input.nextInt();
					}
				int array[]= new int[size];
				System.out.println("enter element in array");
				for(int i= 0;i<size;i++){
				array[i]= input.nextInt();
			}
			System.out.print("we can slice this array at index:"+new SplitArray().spiltArray(array));


	}

}
