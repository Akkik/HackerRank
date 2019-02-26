package DataStructures;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class BigDeci {

	public static void main(String[] args) {
	  /*	String[] a= {".2","1","0.2","0.1"};
	  	Arrays.sort(a, Collections.reverseOrder(new Comparator<String>(){
	  		public int compare(String o1, String o2) {
				BigDecimal a1 =  new BigDecimal(o1);
				BigDecimal a2 =  new BigDecimal(o2);
					return a1.compareTo(a2);
				}
	  	}));
	  	 for(int i=0;i<a.length;i++)
	        {
	            System.out.println(a[i]);
	        }*/
		
	
			Scanner in = new Scanner(System.in);
			int testCases = Integer.parseInt(in.nextLine());
			while(testCases>0){
				String pattern = in.nextLine();
	          	try{
	                  Pattern p = Pattern.compile(pattern);
	                  System.out.println("Valid");
	              }catch(Exception e){
	                  System.out.println("Invalid");
	              }
	            
			}
		
	}

}
