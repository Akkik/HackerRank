package DataStructures;

public class JumpingCloud {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 1, 0, 0 };
		System.out.println(jumpingOnClouds(a));
	}

	static int jumpingOnClouds(int[] c) {
		int count = 0;
		for (int i = 0; i < c.length-1;) {
			if (i+2 < c.length && c[i + 2] == 0) {
				i += 2;
				count++;
			}
			else {
				i++;
				count++;
			}
		}
		return count;
	}
}
