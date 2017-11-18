import java.util.regex.*;

public class RegEx {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("c*");
		Matcher m = p.matcher("ccc");
		System.out.println(m.matches());
		
		// same as:
		System.out.println(Pattern.matches("c*", "ccc"));
		
	}
}
