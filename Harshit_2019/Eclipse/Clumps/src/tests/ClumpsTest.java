package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Assignment4.Clumps;

@RunWith(Parameterized.class)
public class ClumpsTest {

	public int arrayPositive[];
	public int expectedResult;
	public int arrayNegetive[];
	public int notExpectedResult;
		
		
		
	public ClumpsTest(int [] arrayPositive,int expectedResult,int notExpectedResult) {
		this.expectedResult = expectedResult;
		this.arrayPositive=arrayPositive;
		this.notExpectedResult=notExpectedResult;
	}

	

	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				{new int[]{1, 2, 2, 3, 4, 4},2,3},
				{new int[]{1, 1, 2, 1, 1},2,3},
				{new int[]{1, 1, 1, 1, 1},1,2},
				{new int[]{0,0,1,2,3,3,4,5,5,8,8,8,8},4,5},
				{new int[]{},0,1}
				
				
				
		});
	 }
	@Test
	public void testClumpsPositive(){
		Assert.assertEquals(expectedResult,Clumps.countClumps(arrayPositive));
	}
	@Test
	public void testClumpsNegetive(){
		Assert.assertNotEquals(notExpectedResult,Clumps.countClumps(arrayPositive));
	}
}

