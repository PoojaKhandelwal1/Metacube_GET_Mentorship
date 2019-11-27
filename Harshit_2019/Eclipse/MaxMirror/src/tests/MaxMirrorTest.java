package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Assignment4.MaxMirror;

@RunWith(Parameterized.class)
public class MaxMirrorTest {

	public int arrayPositive[];
	public int expectedResult;
	public int notExpectedResult;
		
		
		
	public MaxMirrorTest(int [] arrayPositive,int expectedResult,int notExpectedResult) {
		this.expectedResult = expectedResult;
		this.arrayPositive=arrayPositive;
		this.notExpectedResult=notExpectedResult;
	}
		
		
	
		
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				{new int[]{1, 2, 3, 8, 9, 3, 2, 1},3,2},
				{new int[]{7, 1, 4, 9, 7, 4, 1},2,1},
				{new int[]{1, 2, 1, 4},3,2},
				{new int[]{1, 4, 5, 3, 5, 4, 1},7,1},
				{new int[]{},0,1},
				
				
		});
	 }
		
	@Test
	public void testMirrorLengthPositive(){
		Assert.assertEquals(expectedResult,MaxMirror.maxMirror(arrayPositive));
	}
	@Test
	public void testMirrorLengthNegetive(){
		Assert.assertNotEquals(notExpectedResult,MaxMirror.maxMirror(arrayPositive));
	}
}
