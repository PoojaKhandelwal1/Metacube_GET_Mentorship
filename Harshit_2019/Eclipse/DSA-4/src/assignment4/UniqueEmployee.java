package assignment4;

import java.util.ArrayList;

/**
* Author: Harshit Kasliwal
* Since: august.4, 2019
* Name: EmployeeInfo
* Description: This class provides basic attributes to an employee. 
**/
class EmployeeInfo {

	int id;
	String name;
	String address;

	EmployeeInfo(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
/**
* Author: Harshit Kasliwal
* Since: august.4, 2019
* Name: Employee
* Description: This class used to prevent duplicates id for an employee . 
**/
public class UniqueEmployee {
	
   ArrayList <EmployeeInfo> list = new ArrayList();

	/**
	 * Name: add
	 * Disc: used to check weather an employee can be added or nor.
	 * @param: (1) id- array - array of id's provided by user 
	 * @param: (2) name- array - array of names provided by user
	 * @param: (3) address- array - array of address provided by user
	 * @return: boolean - if added ? true : false
	 **/
	public boolean add(int id[],String name[],String address[]){
		
		for(int i= 0;i<id.length; i++){
			
			EmployeeInfo obj = new EmployeeInfo(id[i],name[i],address[i]);
			for(EmployeeInfo ob : list){
				if(ob.id != id[i]){
					continue;
				}
				else{
					 System.out.println("employee id must be unique");
					 System.out.println(" id "+id[i]+" already exists");
				}
			}
			list.add(obj);
			
		}
    return true;
	}
	

	public static void main(String[] args) {
		int id[] ={1,2,3,1,5};
		String name[] = {"A","B","C","D","E"};
		String address[] = {"a","b","c","d","e"};
		new UniqueEmployee().add(id,name,address);
		
	}
}
