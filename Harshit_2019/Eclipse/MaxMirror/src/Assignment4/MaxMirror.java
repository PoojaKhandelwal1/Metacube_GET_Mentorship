package Assignment4;

public class MaxMirror {
	/**
	 * Find the size of the largest mirror section in array
	 * @param arr array of positive integer
	 * @return length of largest mirror section
	 */
	public static int maxMirror(int arr[]){
		if(arr.length<1){
			try{
		throw new AssertionError();
			}
			catch(AssertionError e){
				System.out.println("array size should al least be 1");
				return 0;
			}
		}
		int length= arr.length;
		int max_mirror= 0,tempMax= 0;
		int upper,lower;
		int lastIndex= length-1;
		for(int loop= 0;loop<length;loop++){
			
			for(int innerLoop= lastIndex;innerLoop>=loop;innerLoop--){
				if(arr[loop]== arr[innerLoop]){
					tempMax= 0;
					upper= loop;
					lower= innerLoop;
					
					while(upper<= lastIndex && lower >=0 && arr[upper]== arr[lower]){
						tempMax++;
						upper++;
						lower--;
						
					}
					if(max_mirror<tempMax)
						max_mirror= tempMax;
				}
			}
		}
		
		return max_mirror;
	}
}
