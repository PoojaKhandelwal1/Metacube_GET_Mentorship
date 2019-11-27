package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import assignmnet6.IntSet;

public class IntSetTest {
	@Test
	public void isMember () {
		Integer[] input = {1,2,3,4,5,5,5,5}; 
		IntSet set =new IntSet(input);
		assertEquals(true,set.isMember(3));
	}
	
	@Test
	public void sizeTest() {
		Integer[] input = {1,2,3,4,5,5,6,5}; 
		IntSet set = new IntSet(input);
		assertEquals((Integer)6,(Integer)set.size());
	}
	@Test
	public void subset() {
		Integer[] input1 = {1,2,3,4,5,5,6,5};
		Integer[] input2 = {2,3,4,6,4};
		IntSet set = new IntSet(input1);
		IntSet subSet = new IntSet(input2);
		assertEquals(true,set.isSubSet(subSet));
	}
	@Ignore
	public void compliment() {
		Integer[] input1 = {1,2,3,4,5};
		IntSet set = new IntSet(input1);
		IntSet complimentSet = set.getCompliment();

	}

	@Ignore
	public void union() {
		Integer[] input1 = {1,2,3,4,5};
		Integer[] input2 = {3,3,2,6,8,6};
		IntSet set1 = new IntSet(input1);
		IntSet set2 = new IntSet(input2);
		IntSet.union(set1,set2);

	}

	@Test(expected=AssertionError.class)
	public void checkRange() {
		Integer[] input = {12,1002};
		IntSet set = new IntSet(input);
	}

}