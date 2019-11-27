package assignment5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Harshit Kasliwal
 * Since: July. 19, 2019
 * Name: Search
 * Description: This class implements concept of linear and binary search. 
**/
public class Search {
	/**
	* Name: linearSearch
	* Disc: used to find index of a given no in an array . 
	* @param:  (1) array- Array - 
	*          (2) integer- start- starting index of given array
	*          (3) integer- start- last index of given array
	*          (4) integer-  x-    value that need to be search    
	* @return: integer - return index where we find the x in given array - -1 if not possible
	**/
	  public static int linearSearch(int arr[], int start, int last, int x){ 
		      if(arr.length<1){
		    	  try{
		    		  throw new AssertionError();
		    	  }
		    	  catch(AssertionError ae){
		    		 System.out.println("Array size should be at least one");
		    		 return -1;
		    	  }
		      }
	          if (last < start){ 
	             return -1; 
	           }
	          if (arr[start] == x){ 
	               return start; 
	          }
	          if (arr[last] == x){
	        	  return last;
	          }
	          return linearSearch(arr, start+1, last-1, x); 
	     } 
	  /**
		* Name: binarySearch
		* Disc: used to find index of a given no in an array . 
		* @param:  (1) array- Array - 
		*          (2) integer- start- starting index of given array
		*          (3) integer- start- last index of given array
		*          (4) integer-  x-    value that need to be search    
		* @return: integer - return index where we find the x in given array - -1 if not possible
		**/
   public static int binarySearch(int arr[], int start ,int last , int x ) {
       if (last >= start) { 
           int mid = start+(last-start)/2;
 
           // If the element is present at the 
           // middle itself 
           if (arr[mid] == x){
               return mid; 
           }
 
           // If element is smaller than mid, then 
           // it can only be present in left subarray 
           if (arr[mid] > x){   
               return binarySearch(arr, start, mid - 1, x);
           }
            
           // Else the element can only be present 
           // in right subarray 
           return binarySearch(arr, mid + 1, last, x); 
       } 
 
       // We reach here when element is not present 
       // in array 
       return -1; 
   } 
   
   public static void main(String[] args){
		int size = 0;
		Scanner input = new Scanner(System.in);
		
	try{
		System.out.println("enter size of array");
		size = input.nextInt();
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
					size= input.nextInt();
					}
			int array[]= new int[size];
			
			System.out.println("enter element in array");
			for(int i= 0;i< size;i++){
			array[i] = input.nextInt();
		    }
			
		    System.out.println("ënter element you want to search");
			int value = input.nextInt();
		
	    int result_ls = new Search().linearSearch(array,0,size-1,value);
	 
	   int result_bs = new Search().binarySearch(array, 0, size-1, value);
	    System.out.print("from linear search ");
	    	if(result_ls < 0){
	    	System.out.println("element not found in array");
	    	}
	    	
	    	else{
	    	System.out.println("element present in array at: "+result_ls);
	    	}
	
	    System.out.print("from binary search ");
	    if(result_bs < 0){
	    	System.out.println("element not found in array");
	     }
	    else{
	    	System.out.println("element present in array at: "+result_bs);
	       }
	
	    
   	
}
}
		
