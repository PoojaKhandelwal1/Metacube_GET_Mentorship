package tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Assignment4.SplitArray;

@RunWith(Parameterized.class)
public class SplitArrayTest {


	public int arrayPositive[];
	public int expectedResult;
	public int arrayNegetive[];
	public int notExpectedResult;
		
		
		
	public SplitArrayTest(int [] arrayPositive,int expectedResult,int notExpectedResult) {
		this.expectedResult = expectedResult;
		this.arrayPositive=arrayPositive;
		this.notExpectedResult=notExpectedResult;
	}

		
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				{new int[]{1, 1, 1, 2, 1},3,2},
				{new int[]{2, 1, 1, 2, 1},-1,2},
				{new int[]{10, 10},1,2},
				{new int[]{},0,1}
				
				
				
		});
	 }
		
	@Test
	public void testsplitArryaPositive(){
		Assert.assertEquals(expectedResult,SplitArray.spiltArray(arrayPositive));
	}	
	@Test
	public void testsplitArrayNegetive(){
		Assert.assertNotEquals(notExpectedResult,SplitArray.spiltArray(arrayPositive));
	}
}

