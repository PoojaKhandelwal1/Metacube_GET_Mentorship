package assignmnet6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Harshit Kasliwal
 * Since: July. 23, 2019
 * Name: Search
 * Description: This class implements various concepts of set 
**/
public class IntSet {
	private final int UPPER_LIMIT = 1000;
	private final int LOWER_LIMIT = 1;
	public final Integer[] set;
	
	public static void main(String[] args) {
		IntSet is=new IntSet(new Integer[]{1,2,2,1,3,4});
	}
	
	public IntSet(Integer[] set) {
		super();
		this.set = CreatenewSet(set);
	}
	
	/**
	* Name: CreatenewSet
	* Disc: used to create a set of given integers
	* @param:  (1) input- Array - Integer     
	* @return: Array-return set of given Integers
	**/
	private Integer[] CreatenewSet(Integer[] input) {
		List<Integer> list = new ArrayList<Integer>();
		Integer[] set;
		  for(int loop=0;loop<input.length;loop++) {
			if(input[loop]< LOWER_LIMIT ||input[loop]>UPPER_LIMIT) {
					 throw new AssertionError();
				 }
			 if(list.contains(input[loop])) {
				 continue;
			 }
			 else {
				 list.add(input[loop]);
			 }
		 }
		 set=new Integer[list.size()];
		 return list.toArray(set);
	 }
	
	/**
	* Name: isMember
	* Disc: used to check if a integer is part of a set or not
	* @param:  (1) value- Integer- value that need to be searched in given array   
	* @return: boolean-if present ? true:false 
	**/
	
	public boolean isMember(Integer value) {
		 if(value<LOWER_LIMIT||value>UPPER_LIMIT) {
			 return false;
		 }
		 for(int loop=0;loop<this.set.length;loop++) {
			 if(value==set[loop]) {
				 return true;
			 }
		 }
		 return false;
	 }
	
	public Integer size() {
		 return this.set.length;
	 }
	/**
	* Name: isSubSet
	* Disc: used to create a set of given integers
	* @param:  (1) subset- IntSet      
	* @return: boolean-if subset ? true:false
	**/
	public boolean isSubSet (IntSet subSet) {
		 List<Integer> mainset = new ArrayList<Integer>(Arrays.asList(this.set));
		 List<Integer> subset = new ArrayList<Integer>(Arrays.asList(subSet.set));
		 if(mainset.containsAll(subset)) {
			 return true;
		 }
		 return false;
	 }
	/**
	* Name: getCompliment
	* Disc: used to compliment a given set
	* @return: Intset - return compliment set of given Integers
	**/
	public IntSet getCompliment() {
		 List<Integer> setList = new ArrayList<Integer>(Arrays.asList(this.set));
		 List<Integer> complimentList = new ArrayList<Integer>();
		 Integer[] newSet;
		 for(int loop=LOWER_LIMIT;loop<=UPPER_LIMIT;loop++){
			 if(setList.contains(loop)) {					// if element is in set then 
				 continue;							// don't add it to the complimentSet
			 }
			 else {
				 complimentList.add(loop);
			}
		 }
		 Object objarr[]=complimentList.toArray();
		 newSet=Arrays.copyOf(objarr, objarr.length,Integer[].class);
		 IntSet complimentSet= new IntSet(newSet);			//using the private constructor for initializing with the result
		 return complimentSet;
	 }
	/**
	* Name: union
	* Disc: used to get union of two given set
	* @param:  (1) firstSet- IntSet
	*          (2) secondSet- IntSet    
	* @return: IntSet- return union of two input sets
	**/
	public static IntSet union(IntSet firstSet,IntSet secondSet) {
		 List<Integer> set1 = new ArrayList<Integer>(Arrays.asList(firstSet.set));
		 List<Integer> set2 = new ArrayList<Integer>(Arrays.asList(secondSet.set));
		 List<Integer> unionSet = new ArrayList<Integer>();
		 unionSet.addAll(set1);
		 for(int loop=0;loop<set2.size();loop++) {
			 if(!unionSet.contains(set2.get(loop))) {			// add only those elements which are not 
				 unionSet.add(set2.get(loop));				// present in the set1.
			 }
		 }
		 Object objarr[]=unionSet.toArray();
		 Integer intarr[]=Arrays.copyOf(objarr, objarr.length,Integer[].class);
		 IntSet union= new IntSet(intarr);
		 return union;
		 
	 }
	

}

