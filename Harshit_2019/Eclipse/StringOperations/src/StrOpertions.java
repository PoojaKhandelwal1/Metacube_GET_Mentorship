import java.util.Arrays;
import java.util.Scanner;

/**
* Author: HARSHIT kASLIWAL
* Since: JULY.15,2019	
* Name: StrOpertions
* Description: This class takes two string as a input and perform various operations on them.
**/
public class StrOpertions {
	/**
	* Name: strCompare
	* Description: to comparer both string provided by user
	* @param:  (1) first - String - first string provided by user
	(2)  second- String - second string provided by user
	* @return: Type - integer
	*  usage:compare both strings and return if they are equal or not. 
	**/
	int strCompare(String first,String second){
		int length1=first.length();
		int length2=second.length();
		int ans=1;
		
		if(length1 != length2)
			ans=0;
		else{
			for(int i=0;i<length1;i++){
				int ch1=(int)(first.charAt(i));
				int ch2=(int)(second.charAt(i));
					if(ch1!=ch2){
					   ans=0;
						}
			}
		}
		return ans;
	}
	/**
	* Name: reverse
	* Description: to reverse the string provided by user
	* @param:  (1) input - String - String provided by user to be reversed 
	* @return: Type - String
	*  usage:return reverse of string 
	**/
	String reverse(String input){
		
		String rev="";
		for(int i=input.length()-1;i>=0;i--){
				rev=rev+input.charAt(i);
		}
		return rev;
	}
	/**
	* Name: alter
	* Description: to alter the string provided by user
	* @param:  (1) input-String-String provided  by user to be altered
	* @return: Type - String
	*  usage:return String which convert upperCase character to lowerCase and vice-versa. 
	**/
    String alter(String input){
		String ans="";
		for(int i=0;i<input.length();i++){
			     int a=(int)(input.charAt(i));
				 if((a>64)&&(a<=90)){
					 a=a+32;
					 char c=(char)(a);
					ans=ans+c;
				 }
				 
			  else	{
					 a=a-32;
					 char c=(char)(a);
					 ans=ans+c;
			  		}
				 
		}
		System.out.println(ans);
		return ans;
	}
    /**
    * Name: largestWord
    * Description: to retrieve largest word in a given string
    * @param:  (1) input-String-String provided by user
    * @return: Type - String
    *  usage:return largest word from a given String. 
    **/
    String largestWord(String input){
    	 String[] word = input.split( " " );
         String ans="";
         for ( int i = 0; i < word.length; i++ )
         {
             if ( word[i].length() >= ans.length() )
                 ans = word[i];

         }
		return ans;
    }
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("abcd" + strCompare("abc", "abc"));
		 StrOpertions obj=new StrOpertions();
		
		int choice;
		do{
			
			System.out.println("Choice Option");
			System.out.println("1. compare to strings");
			System.out.println("2. reverse a string");
			System.out.println("3. alter a string");
			System.out.println("4. find largest word in a string");
			System.out.println("0. To Exit");
			System.out.println("Ënter Your Choice:");
			 choice=sc.nextInt();
			if(choice==1){
				System.out.println("enter two strings you want to compare");
				String firstString=sc.nextLine();
				sc.nextLine();
				String secondString=sc.nextLine();
				System.out.println("both are string are equlal:"+obj.strCompare(firstString, secondString));
			}
			else if(choice==2){
					System.out.println("enter the string you want to reverse");
					String firstString=sc.nextLine();
					sc.nextLine();
					System.out.println("reverse of first string is:"+obj.reverse(firstString));
			
				
			}
			else if(choice==3){
					System.out.println("enter the string you want to alter");
					sc.nextLine();
					String firstString=sc.nextLine();
				;
					System.out.println("After alteration first string will be:"+obj.alter(firstString));
			
				
			}
			else if(choice==4){
					System.out.println("enter the string to find larest word init");
					sc.nextLine();
					String firstString=sc.nextLine();
					System.out.println("longest word in first string is:"+obj.largestWord(firstString));
			
				
			}
			else if(choice==0)
			{
				break;
			}
			else
				System.out.println("Invalid choice...");
			System.out.println("-----------------------------------------------------------------------");
		}
		
		while(choice!=0);
		System.exit(1);
		
		
		 
		
		
	
	  

	}

}
