package assignmnet6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Author: Harshit Kasliwal
* Since: July. 22, 2019
* Name: Poly
* Description: This class used to perform various operations on polynomials. 
**/

public final class Poly {

	/**
	* Name: printPoly
	* Disc: used to print given polynomial. 
	* @param:  (1) poly-array- array of coefficient provided by user-always positive
	* @return: void-print the array in the polynomial format
	**/
	public final  void printPoly(int poly[], int n) { 
        for (int i = 0; i < n; i++) { 
            System.out.print(poly[i]); 
            if (i != 0){ 
            	System.out.print("x^" + i); 
            } 
            if (i != n - 1) { 
                System.out.print(" + "); 
            } 
        }  
    }

	/**
	* Name: addPoly
	* Disc: used to add to given polynomial. 
	* @param:  (1) first- array - first array of coefficient provided by user-always positive
	*          (2) second-array - second array of coefficient provided by user-always positive
	* @return: sum -array-return sum of both  
	**/
   public final int[] addPoly(int[]first,int[] second){
    	int ans_size = Math.max(first.length,second.length);
    	if(ans_size<=0){
    		try{
    			throw new AssertionError();
    		}
    		catch(AssertionError ae){
    			System.out.println("array size should al least be one");
    			 return new int[]{0};
    		}
    		catch(Exception e){
    			System.out.println("Exception occurs");
    			e.printStackTrace();
    		}
    	}
    	     	int[]sum=new int[ans_size];
    	     for(int i= 0;i< first.length; i++){
    	    	 sum[i]=first[i]; 
    	     }
    	     for(int i= 0;i< second.length;i++){
    	           sum[i]+= second[i];
    	     }
    	     return sum;
    }

	/**
	* Name: multiplyPoly
	* Disc: used to add to given polynomial. 
	* @param:  (1) first- array - first array of coefficient provided by user-always positive
	*          (2) second-array - second array of coefficient provided by user-always positive
	* @return: sum -array-return product of both  
	**/
    public final int[] multiplyPoly(int[]first,int[] second){
    int ans_size = first.length+second.length-1;
    if(ans_size<= 0){
		try{
			throw new AssertionError();
		}
		catch(AssertionError ae){
			System.out.println("array size should al least be one");
			 return new int[]{0};
		}
		catch(Exception e){
			System.out.println("Exception occurs");
			e.printStackTrace();
			return new int[]{0};
		}
	}
    	 int multiply[]=new int[ans_size];
    	 Arrays.fill(multiply,0);
    	  for(int i = 0;i < first.length;i++){
    		  for(int j = 0;j < second.length;j++){
    			    multiply[i+j]+= first[i]*second[j];
    		  }
    	  }
    
    	     return multiply;
    }

	/**
	* Name: degree
	* Disc: used to add to given polynomial. 
	* @param:  (1) first- array - first array of coefficient provided by user-always positive
	* @return: sum -array-return degree of the polynomial 
	**/
     public final int degree(int [] first){
    	int ans= 0;
    	if(first.length<=0){
    		try{
    			throw new AssertionError();
    		}
    		catch(AssertionError ae){
    			System.out.println("array size should al least be one");
    			 return 0;
    		}
    		catch(Exception e){
    			System.out.println("Exception occurs");
    			e.printStackTrace();
    			return 0;
    		}
    	}
    	for(int i = first.length-1;i >= 0;i--){
    		  if(first[i]!=0){
    			  ans = i;
    			  break;
    		  }
    	}
    	return ans;
    }

	/**
	* Name: evaluate
	* Disc: used to evaluate given polynomial at a given value. 
	* @param:  (1) first- array - first array of coefficient provided by user
	*          (2) value-integer - second array of coefficient provided by user
	* @return: sum -array-return sum of both  
	**/
     public final double evaluate(int arr[],int value){
    	 if(arr.length<=0){
     		try{
     			throw new AssertionError();
     		}
     		catch(AssertionError ae){
     			System.out.println("array size should al least be one");
     			 return 0;
     		}
     		catch(Exception e){
     			System.out.println("Exception occurs");
     			e.printStackTrace();
     			return 0;
     		}
     	}
    	 double ans= 0;
    	 
    	 for(int i= 0;i< arr.length;i++){
    		  if(arr[i] == 0){
    			  continue;
    		  }
    		  else{
    			  ans= ans+arr[i]*Math.pow(value,i);
    		  }
    	 }
    	 return ans;
    }
    
  
	public static void main(String[] args) {
		       
		
		
			Scanner input=new Scanner(System.in);
			System.out.println("enter your choice");
			System.out.println("press 1 for evaluating polynomial ");
			System.out.println("press 2 for find the degree of a polynomial");
			System.out.println("press 3 for add two polynomial");
			System.out.println("press 4 for multiply two polynomial");
			 int choice= input.nextInt();
						 int size1=0;
						 int size2=0;
					try{
						System.out.println("enter size (degree of poly+1) of first poly");
						size1 = input.nextInt();
						System.out.println("enter size (degree of poly+1) for second poly");
						size2 = input.nextInt();		
					  }
					catch(InputMismatchException ae){
							System.out.println("size must be a number");
							System.out.println("give another size");
							input.nextLine();
							size1= input.nextInt();
							size2= input.nextInt();
							}
					catch(Exception e){
						System.out.println("size must be a number");
						System.out.println("give another size");
						input.nextLine();
						size1= input.nextInt();
						size2= input.nextInt();
					}
						if(size1<= 0 || size2<=0){
									System.out.println("size can not be negetive");
									System.out.println("enter non negetive size for array");
									size1= input.nextInt();
									size2= input.nextInt();
									}
							int poly1[] = new int[size1];
							int poly2[] = new int[size2];
							
						
							System.out.println("enter cofficent (starting from constant.. max power of x . enter zero if   cofficent not present  ) of first poly");
							for(int i= 0;i< size1;i++){
							poly1[i] = input.nextInt();
						    }
							System.out.println("enter cofficent(starting from constant.. max power of x . enter zero if cofficent not present  ) of second poly");
							for(int i= 0;i< size2;i++){
								poly2[i]= input.nextInt();
							}
							
						 switch(choice){
						 case 1:
							 System.out.println("enter value for variable ");
							 int value=input.nextInt();
							 System.out.println("evaluation for given polynomial is: "+new Poly().evaluate(poly1, value));
							 break;
						 case 2:
							 System.out.println("degree of given polynomial is: "+ new Poly().degree(poly1));
							 break;
						 case 3:
							 int sum[]=new Poly().addPoly(poly1, poly2);
							 System.out.println("sum of polynomials is: ");
							  new Poly().printPoly(sum, sum.length);
							  break;
						 case 4:
						    int multiply[]= new Poly().multiplyPoly(poly1, poly2);
						    System.out.println("multiplication  of polynomials is: ");
							  new Poly().printPoly(multiply, multiply.length);
							  break;
						    
						 
						 }
							    
								
			 }
	          
	
	 
			
		/*	System.out.println("first poly is:");
			new Poly().printPoly(poly1, size1);
			System.out.println("");
			System.out.println("degree of poly is"+new Poly().degree(poly1));
			
			System.out.println("second poly is:");
			new Poly().printPoly(poly2,size2);
			System.out.println("");
			System.out.println("degree of poly is"+new Poly().degree(poly2));
		   
		 	 int sum[]=new Poly().addPoly(poly1,poly2);
		 	 System.out.println("sum of two given poly'is:");
		 	 new Poly().printPoly(sum, sum.length);
		 	System.out.println("");
		 	System.out.println("degree of poly is:"+new Poly().degree(sum));
		 	 
		 	 int multiply[]=new Poly().multiplyPoly(poly1,poly2);
		 	 System.out.println("multiplication of two given poly's is:");
		 	 System.out.println("");
		 	 new Poly().printPoly(multiply, multiply.length);
		 	System.out.println("degree of poly is:"+new Poly().degree(multiply));
		
		*/
			
	}

