package Assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class FitXy {
	/**
	* Name: fitXY
	* Description: to
	* @param:  (1) arr - array - array provided by user
	(2)  x- integer - value that user wants at fix position
	(3)  y- integer - value that will follow x
	* @return: Type - array
	*  usage:return array  
	**/
	public static int[] fitXY(int [] arr,int x,int y){
		if(arr.length<1){
			try{
		throw new AssertionError();
			}
			catch(AssertionError e){
				System.out.println("ärray size should be at least one ");
				return new int[] {0};
			}
		}
		int  lastIndex= arr.length-1;
		
		if(arr[lastIndex]== x){
			try{
			throw new AssertionError();
			}
			catch(AssertionError Error){
				System.out.println("fix value:"+x+" should not be at last place");
				return new int[]{0};
			}
		}
		
		int countx= 0,county= 0;
		
		/** Start: can be a single for loop?????*/
		for(int loop= 0;loop<= lastIndex;loop++){
			if(arr[loop]== y) // incorrect ?????? [1, 2, 2, 3] ???? [1,2]
				countx++;
			if(arr[loop]== y)
				county++;	
		}
		if(countx!=county){
			try{
			throw new AssertionError();
			}
			catch(AssertionError e){
				System.out.println("fix value"+x+"and follower value"+y+"should be equal in number");
				return new int[]{0};
			}
		}
		for(int loop=0;loop<lastIndex;loop++){
			if(arr[loop]== x && arr[loop+1]== x){
				try{
				throw new AssertionError();
				}
				catch(AssertionError e ){
					System.out.println("fix value shold not be continous");
					 return new int[]{0};
				}
			}
		}
		int brr[]=new int[arr.length];
		Arrays.fill(brr,0);
		for(int i=0;i<arr.length;i++)
 		  {
 			 if(arr[i]== x){
 				 brr[i]= x;
 				 brr[i+1]= y;
 			  }
 		  }
		/**Start: can be a single for loop?????*/
		
		
 		  int index= 0;
 		  for(int i= 0;i<brr.length;i++)
 		  {
               if(brr[i]== 0)
               {
            	   for(int j= index;j<arr.length;j++)
            	   {
            		   if((arr[j]!= x) &&(arr[j]!=y ))
            		   {
            			
            			 brr[i]= arr[j];
            			 index= j+1;
            			 break;
            		   }
            	   }
               }
 		  }
         
	 return brr;
	}

	public static void main(String[] args){
			int size= 0;
			Scanner input= new Scanner(System.in);
	try{
		
		System.out.println("enter size of array");
		size= input.nextInt();
	  }
	catch(Exception ae){
		System.out.println("size should be an number");
		System.out.println("give another size");
		input.nextLine();
		size=input.nextInt();
	  }
		if(size<=0){
				System.out.println("size can not be negetive");
				System.out.println("enter non negetive size for array");
				size=input.nextInt();
				}
			int array[]= new int[size];
			System.out.println("enter element in array");
			for(int i=0;i<size;i++)
			{
			array[i]= input.nextInt();
		    }
			
			System.out.println("enter the value you want to remain at fix position in array");
			 int fix=input.nextInt();
			 System.out.println("ënter follower of fix value in array");
			 int follower=input.nextInt();
			 
			 FitXy obj=new FitXy();
			 int ans[]=obj.fitXY(array, fix, follower);
			 for(int a:ans){
				 System.out.print(a);
			 }
			
	}

}
