package DataStructures;

import java.util.Arrays;

public class MaximumToys {

	public static void main(String[] args) {
		int [] a = {1 ,12 ,5 ,111 ,200, 1000, 10};
		System.out.println(maximumToys(a,50));
	}
	static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		int sum =0;
		int count =0;
		for(int i=0;i<prices.length;i++) {
			if(sum + prices[i] > k)
				break;
			else
				sum+= prices[i];
			    count ++;
		}
		return count;
    }
 
}
