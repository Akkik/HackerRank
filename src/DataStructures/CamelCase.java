package DataStructures;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CamelCase {

	public static void main(String[] args) {
		String camelCase = "saveChangesInTheEditor";
		/*String sb = new String();
		char []  arr = camelCase.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			sb +=arr[i];
			if(Character.isUpperCase(arr[i+1]))
				sb += " ";
		}
		System.out.println(sb.split(" ").length);*/
		
	
		
		System.out.println(camelcase(camelCase+1));
	}
	
	
	static int camelcase(String s) {
     return (int) s.chars().filter(c->Character.isUpperCase(c)).count();
	}
	
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		
    }
}
