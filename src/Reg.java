import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("(g|G)(<>|0|o|O|\\[\\]|\\(\\)){1,2}(g|G)(L|I|1|I)(e|E|3)");  
        Matcher m = pattern.matcher("googlee");
        System.out.println(m.find());
        	
	}

}
