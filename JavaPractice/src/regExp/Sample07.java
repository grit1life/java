package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample07 {

	public static void main(String[] args) {
		String[] str = {"ASDF12", "123456", "qwert", "as45aa", "123456jkl", "010-1234-5678"
				, "1234개"};
		String regexp = "[^0-9]";
		
		for(String data : str) {
			System.out.printf("%s \t %s\n", data, data.replaceAll(regexp, ""));
		}
		
		
		String no = "주민등록 번호 : 010101-23456789 주민등록 번호 : 020202-4567890";
		String regexp2 = "[0-9]{6}-[0-9]{7}";
		Pattern p = Pattern.compile(regexp2);
		Matcher m = p.matcher(no);
		
		while(m.find()) {
			System.out.printf(m.group() + " -> ");
			String newNo = m.group().substring(0, 7) + "****" + m.group().substring(11);
			System.out.println(newNo);
		}
		
		
	}

}
