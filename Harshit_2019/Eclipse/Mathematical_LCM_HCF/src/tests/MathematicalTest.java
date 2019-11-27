package tests;
import java.util.Arrays;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import assignment5.Mathematical;

public class MathematicalTest {

	@RunWith(Parameterized.class)
	public static class MathematicalTest1 {

		
		public int lcm_Expected;
		public int lcm_NotExpected;
		public int hcf_Expected;
		public int hcf_NotExpected;
		public static int first;
		public static int second;
	
			
			
			
		public MathematicalTest1(int first,int second,int lcm_Expected,int hcf_Expected,int lcm_NotExpected,int hcf_NotExpected){
			this.first=first;
			this.second=second;
			this.lcm_Expected=lcm_Expected;
			this.lcm_NotExpected=lcm_NotExpected;
			this.hcf_Expected=hcf_Expected;
			this.hcf_NotExpected=lcm_NotExpected;
			
			
		}

		

		@Parameterized.Parameters
		public static Collection<Object[]> data(){
			return Arrays.asList(new Object[][] {
					{2,4,4,2,10,12},
					{17,34,34,17,5,10},
					{8,15,120,1,10,11},
					{30,75,150,15,17,150}
					
					
					
			});
		 }
		@Test
		public void lcmTestPositive(){
			Assert.assertEquals(lcm_Expected,new Mathematical().calculateLcm(first, second));
		}
		@Test
		public void lcmTestNegetive(){
			Assert.assertNotEquals(lcm_NotExpected,new Mathematical().calculateLcm(first, second));
		}
		
		@Test
		public void hcfTestPositive(){
			Assert.assertEquals(hcf_Expected,new Mathematical().calculateHcf(first, second));
		}
		@Test
		public void hcfTestNegetive(){
			Assert.assertNotEquals(hcf_NotExpected,new Mathematical().calculateHcf(first, second));
		}
	}


}
