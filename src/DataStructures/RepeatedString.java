package DataStructures;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		System.out.println(re());
	}

	public static long re() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long r = n % s.length();
		int rem = 0;
		for (int i = 0; i < r; i++)
			if (s.charAt(i) == 'a')
				rem++;
		return s.chars().filter(num -> num == 'a').count() * Math.floorDiv(n, s.length()) + rem;
	}
}
