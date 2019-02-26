package DataStructures;

import java.util.*;
import java.util.regex.Pattern;
public class Trek {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int v=0;
        int val = 0;
        for(char c : s.toCharArray()) {
        		if(c == 'U')
        			val ++;
        		else
        			val -- ;
        		if(val == 0 && c == 'U')
        			v++;
        }
        System.out.println(v);
    }

}
