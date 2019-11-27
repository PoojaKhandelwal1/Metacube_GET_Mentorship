package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import assignment5.Search;

public class SearchTest {

	@RunWith(Parameterized.class)
	public static class SearchTest1 {

		public int arrayPositive[];
		public int expectedResult;
		public int notExpectedResult;
		public int start;
		public int last;
		public int key;
			
			
			
		public SearchTest1(int [] arrayPositive,int expectedResult,int notExpectedResult,int start,int last,int key) {
			this.expectedResult = expectedResult;
			this.arrayPositive=arrayPositive;
			this.notExpectedResult=notExpectedResult;
			this.start=start;
			this.last=last;
			this.key=key;
		}

		

		@Parameterized.Parameters
		public static Collection<Object[]> data(){
			return Arrays.asList(new Object[][] {
					{new int[]{1, 2, 3, 4, 5, 6},2,3,0,5,3},
					{new int[]{2,3,4,5,6,7,8},4,3,0,6,6},
					{new int[]{1, 2, 4, 5, 7},-1,0,0,4,6},
					{new int[]{},-1,1,0,-1,4}
					
					
					
			});
		 }
		@Test
		public void searchTestPositive(){
			Assert.assertEquals(expectedResult,Search.linearSearch(arrayPositive,start,last,key));
		}
		@Test
		public void searchTestNegetive(){
			Assert.assertNotEquals(notExpectedResult,Search.linearSearch(arrayPositive,start,last,key));
		}
		
		@Test
		public void bSearchTestPositive(){
			Assert.assertEquals(expectedResult,Search.binarySearch(arrayPositive,start,last,key));
		}
		@Test
		public void bSearchTestNegetive(){
			Assert.assertNotEquals(notExpectedResult,Search.binarySearch(arrayPositive,start,last,key));
		}
	}


}
