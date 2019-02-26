package DataStructures;

import java.util.Arrays;

public class AppleOrange {

	public static void main(String[] args) {
		int[] apples = {-2, 2 ,1};
		int[] oranges = {5,-6};
		countApplesAndOranges(7,11,5,15,apples,oranges);
	/*	house  - 7 -11
  m - apples
  n - oranges
  
  -a - apple base 
  b - orange base
  */
	}
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		System.out.println(
				Arrays.stream(apples).map(apple -> apple+a).filter(apple -> (apple >= s && apple<=t)).count() + "\n" + 
						Arrays.stream(oranges).map(orange -> orange+b).filter(orange -> (orange >= s && orange<=t)).count()
				);	
		
    }
}
