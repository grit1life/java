package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sampe01 {

	public static void main(String[] args) {
		String str = "123-4567-8901";
		String exp1 = "^[0-9-]*$";
		String exp2 = "^[\\d-]*$";
		
		System.out.println(str.matches(exp1));
		System.out.println(str.matches(exp2));
		System.out.println();
		
		String[] strs = {"ASDF12", "123456", "qwerty", "as4swe", "2345AS", "A"};
		String regexp = "^[A-Z0-9]{6}$";
		
		for(String data : strs) {
			System.out.printf("%s\t%b\n", data, data.matches(regexp));
		}
		System.out.println();
		
		String target = "sample@sample.com";
		String regexp2 = "([\\w]+@[\\w]+.com)";
		System.out.println(target.matches(regexp2));
		
	}

}
