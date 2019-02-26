package DataStructures;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ex 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
    	sc.nextBigDecimal();
    	NumberFormat nF ;
    nF = NumberFormat.getCurrencyInstance(Locale.CHINA);
    String china = nF.format(12324.134);
    nF =NumberFormat.getCurrencyInstance(Locale.US);
    String us = nF.format(12324.134);
    nF =NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
    String india = nF.format(12324.134);
    nF =NumberFormat.getCurrencyInstance(Locale.FRANCE);
    String france = nF.format(12324.134);
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);

       try {
    	   	System.out.println(power(0,0));
       }catch(Exception e) {
    	   	System.out.println(e);
       }
    }
    public static long power(int n, int p) throws Exception{
    		if(n == 0 && p ==0)
    			throw new Exception("n and p should not be zero.");
    		else if(n <0 || p < 0)
    			throw new Exception("n or p should not be negative.");
    		else
    			return (long) Math.pow(n,p);
    }
}
