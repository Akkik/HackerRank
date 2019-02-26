package DataStructures;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SockMerchant {

	public static void main(String[] args) {
		int[] ar = {10,20,20,10,10,30,50,10,20};
 
		sockMerchant(ar.length,ar);
	}
	
	static int sockMerchant(int n, int[] ar) {
		int count =0;
		List<Integer> l = Arrays.stream(ar).boxed().collect(Collectors.toList());
		Set<Integer> pairs = new HashSet<>(l);
		for (Integer s : pairs) {
			 count = count + Collections.frequency(l, s ) / 2;
		}
		return count;
    }

}
