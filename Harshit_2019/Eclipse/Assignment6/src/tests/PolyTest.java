package tests;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import assignmnet6.Poly;

	public class PolyTest {

		@RunWith(Parameterized.class)
		public static class PolyTest1 {

			public int array1[];
			public int array2[];
			public int value=1;
			public int expectedResult;
			public int notExpectedResult;
				
				
				
			public PolyTest1(int [] array1,int [] array2) {
				this.array1=array1;
				this.array2=array2;
				
			}

			

			@Parameterized.Parameters
			public static Collection<Object[]> data(){
				return Arrays.asList(new Object[][] {
						{new int[]{1,1,1},new int[]{1,1,1}}
				});
			 }
			@Test
			public void EvaluateTestPositive(){
				Assert.assertEquals(3,new Poly().evaluate(array1,1),0.01);
			}
			@Test
			public void EvaluateTestNegetive(){
				Assert.assertNotEquals(3,new Poly().evaluate(array1,-1));
			}
			
			@Test
			public void multiplyPolyTestPositive(){
				Assert.assertArrayEquals(new int[]{1,2,3,2,1},new Poly().multiplyPoly(array1,array2));
			}
			@Test
			public void multiplyPolyTestNegetive(){
				Assert.assertNotEquals(new int[]{1},new Poly().multiplyPoly(array1,array2));
			}
			@Test
			public void addPolyTestPositive(){
				Assert.assertArrayEquals(new int[]{2,2,2},new Poly().addPoly(array1,array2));
			}
			@Test
			public void addPolyTestNegetive(){
				Assert.assertNotEquals(new int[]{1},new Poly().addPoly(array1,array2));
			}
			@Test
			public void degreeTestPositive(){
				
				Assert.assertEquals(2,new Poly().degree(array1));
				
			}
			@Test
			public void degreeTestNegetive(){
				
				Assert.assertNotEquals(3,new Poly().degree(new int[]{0,1,2}));
				
			}

		}


	}


