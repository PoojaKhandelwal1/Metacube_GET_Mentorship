import java.util.Scanner;


/**
* Author: HARSHIT kASLIWAL
* Since: JULY.15,2019	
* Name: MARKSHEET
* Description: This class takes students examination data as input  and performs  statistical operations on that data.
**/
public class MarkSheet {
	/**
	* Name: averageMarks
	* Description: to calculate average marks obtain by students
	* @param:  (1) marks - array - array of marks obtain by students
	(2)  count- integer - no of students in class
	* @return: Type - float
	*  usage:return average marks which can be utilize in further calculations. 
	**/
	float averageMarks(int []arr, int count){ 
		float average=0;
		float sum=0;
		  for(int i=0;i<count;i++){
			   sum=sum+arr[i];
			   
		   }
		  return sum/count;
	}

	/**
	* Name: maxMarks
	* Description: to calculate maximum marks obtain by students
	* @param:  (1) marks - array - array of marks obtain by students
	(2)  count- integer - no of students in class
	* @return: Type -integer
	*  usage:return maximum marks which can be utilize in further calculations. 
	**/
	int maxMarks(int[]marks,int count){
		int max = 0;
	   for(int i=0;i<count;i++){
		   if(max<marks[i]){
			 max=marks[i];  
		   }
		   
	   }
	   return max;
	}
	

/**
* Name: minMarks
* Description: to calculate minimum marks obtain by students
* @param:  (1) marks - array - array of marks obtain by students
(2)  count- integer - no of students in class
* @return: Type - integer
*  usage:return minimum marks which can be utilize in further calculations. 
*/
		int minMarks(int[]marks,int count){
		   int min=101;
		   for(int i=0;i<count;i++){
			   	if(min>marks[i]){
				   min=marks[i];  
			   }
				 
			 }
		 return min;
	       
	 }

/**
* Name: passedPercent
* Description: to calculate percentage of students who have passed the examination marks obtain by students
* @param:  (1) marks - array - array of marks obtain by students
(2)  count- integer - no of students in class
* @return: Type - float
*  usage:return percentage of students which have passed the examination and can be utilize in further calculations. 
**/
	 float passedPercent(int[]marks,int count){
		  
		    float passed_students =0;
		    for(int i=0;i<count;i++){
		    	if(marks[i]>=40){
		    		passed_students++;
		    	} 	
		    }
		    float ans=(passed_students/count)*100;
		    return ans;
	 }

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("ENTER NO OF STUDENTS");
	   int count=sc.nextInt();
	   int marks[]=new int[count];
	   System.out.println("ENTER MARKS OF STUDENTS");
	   for(int i=0;i<count;i++){
		   int a=sc.nextInt();
		     if((a>100)||(a<0)){
		    	 System.out.println("wrong input");
		    	 System.out.println("enter marks again");
		    	 i--;
		     }
		     else{
		    	 marks[i]=a;
		     }
		   
	   }
	   
	   MarkSheet obj=new MarkSheet();
	   float avarage_marks= obj.averageMarks(marks,count);
	   int max_marks=obj.maxMarks(marks,count);
	   int min_marks= obj.minMarks(marks, count);
	   float pass_precent=obj.passedPercent(marks, count);
	   
	   System.out.println("avarage marks of class is:"+avarage_marks);
	   System.out.println("max marks obtain by student is:"+max_marks);
	   System.out.println("minimum marks obtain by student is:"+min_marks);
	   System.out.println("toatl precetage of students passed the examination is:"+pass_precent);
	 

	}

}
