package DataStructures;

import java.util.*;

public class Subarr {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] input = new int[length];
		int count = 0;
		for (int i = 0; i < length; i++) {
			input[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum = 0;
			for (int j = i; j < length; j++) {
				sum = sum + input[j];
				if (sum < 0)
					count++;

			}
		}
	}

}
