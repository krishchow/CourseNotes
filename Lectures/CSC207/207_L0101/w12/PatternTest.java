import java.util.regex.*;

public class PatternTest {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\w){4}\\1");
		
		Matcher m = p.matcher("csioo");
		System.out.println(m.matches());
		System.out.println(m.group(1));
	}
}
