package assignment1;

import java.util.Scanner;
class Node{
	
}
class Node1{
	int data;
	Node1 next;
}

class LinkedList1{
	  Node1 head;
	  
	void insert(int x){
		Node1 node1=new Node1();
		node1.data = x;
		node1.next = null;
		if(head == null){
			head =node1;
			
		}
		else{
			Node1 n = head;
			while(n.next != null){
				   n= n.next;
			}
			n.next=node1;
		}
	}
	
	void display(){
		Node1 n = head;
		String s = "";
		while(n.next != null){
			System.out.println(n.data);
			s += n.data;
			 n= n.next;
		}
		s += n.data;
		System.out.println(n.data);
	}
	
	 void rotate(int k ){
	 
		int length=1;
		Node1 n=head;
		// calculating total length
		while(n.next != null){
				n=n.next;
				length++;
			}
		Node1 current = head;
	     int count=1;
	     //System.out.println("length is "+length);
	     // calculating kth node that will be our last node 
         while(count < length-k && current != null  ){
        	 	current =current.next;
        	 	count++;	 
         }
         Node1 kthnode=current;
         System.out.println("kth node is"+kthnode.data);
         current = head;
         // calculating last node 
          while(current.next != null){
        	    current = current.next;
         }
          System.out.println(current.data);
         
         current.next=head;
         head=kthnode.next;
         kthnode.next= null;       
		
	}
	
}
public class RotateLinkedList {
     public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
	     LinkedList1 obj =new LinkedList1();
	     obj.insert(10);
	     obj.insert(20);
	     obj.insert(30);
	     obj.insert(40);
	     obj.insert(50);
	     obj.insert(60);
	     obj.insert(70);
	     System.out.println("linked list before rotation :");
	     obj.display();
	     System.out.println("enter no of time you want to rotate the list :(clockwise)");
	     int no=sc.nextInt();
	     obj.rotate(no);
	     obj.display();
	     
	}
}
