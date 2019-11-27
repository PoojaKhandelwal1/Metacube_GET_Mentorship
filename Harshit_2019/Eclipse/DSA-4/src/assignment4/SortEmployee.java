package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
* Author: Harshit Kasliwal
* Since: august.4, 2019
* Name: Employee
* Description: This class provides basic attributes to an employee. 
**/
class Employee {

	int id;
	String name;
	String address;

	Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public static Comparator<Employee> Ename = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2) {
			return e2.name.compareTo(e1.name);

		}
	};

	public static Comparator<Employee> Eid = new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			return e2.id - e1.id;
		}

	};
	public static Comparator<Employee> Eaddress = new Comparator<Employee>() {
		@Override
		public int compare(Employee e1, Employee e2) {

			return e1.address.compareToIgnoreCase(e2.address);
		}
	};

}

/**
* Author: Harshit Kasliwal
* Since: august.4, 2019
* Name: sortEmployee
* Description: This class used to provide input and display result. 
**/
public class SortEmployee {
	public static void main(String[] args) {

		Employee ob1 = new Employee(1, "Z", "ZCD");
		Employee ob2 = new Employee(2, "B", "EFG");
		Employee ob3 = new Employee(3, "C", "IJK");
		Employee ob4 = new Employee(13, "D", "LMN");
		Employee ob5 = new Employee(5, "E", "OPK");
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(ob1);
		list.add(ob2);
		list.add(ob3);
		list.add(ob4);
		list.add(ob5);
		Collections.sort(list, Employee.Ename);

		System.out.println("sorting result name wise");
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.address);
		}

		System.out.println("sorting result id wise");
		Collections.sort(list, Employee.Eid);
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.address);
		}

		System.out.println("sorting result address wise");
		Collections.sort(list, Employee.Eaddress);
		for (Employee e : list) {
			System.out.println(e.id + " " + e.name + " " + e.address);
		}

	}

}
