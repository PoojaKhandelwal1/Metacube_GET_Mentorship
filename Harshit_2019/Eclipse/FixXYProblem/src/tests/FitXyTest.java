package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import Assignment4.FitXy;

@RunWith(Parameterized.class)
public class FitXyTest {

	public int arrayPositive[];
	public int expectedResult[];
	public int arrayNegetive[];
	public int notExpectedResult[];
	public int x;
	public int y;
		
		
	public FitXyTest(int [] arrayPositive,int[] expectedResult,int notExpectedResult[],int x,int y) {
		this.expectedResult = expectedResult;
		this.arrayPositive=arrayPositive;
		this.notExpectedResult=notExpectedResult;
		this.x=x;
		this.y=y;
	}
	@Parameterized.Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
				
				{new int[]{5, 4, 9, 4, 9, 5},new int[]{9, 4, 5, 4, 5, 9},new int[]{9, 4, 5, 4, 5, 8}, 4, 5},
				{new int[]{1, 4, 1, 5},new int[]{1, 4, 5, 1},new int[]{9, 4, 5, 4, 5, 9},4,5},
				{new int[]{1, 4, 1, 5, 5, 4, 1},new int[]{1, 4, 5, 1, 1, 4, 5},new int[]{9, 4, 5, 4, 5, 9},4,5},
				{new int[]{},new int[]{0},new int[]{9, 4, 5, 4, 5, 9},4,5}				
				
				
		});
	 }
	@Test
	public void testfitXyPositive(){
		Assert.assertArrayEquals(expectedResult,FitXy.fitXY(arrayPositive,x,y));
	}
	@Test
	public void testfitXyNegetive(){
		Assert.assertFalse(Arrays.equals(notExpectedResult, FitXy.fitXY(arrayPositive,x,y)));
	}
	
}

