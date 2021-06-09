package regExp;

public class RegexpTest {

	public static void main(String[] args) {
		String regexpMail = "[\\w]+@[\\w]+.(com|net)";
		String[] mails = {"aaa@naver.com", "bbb@daum.net", "@naver.com", "aaa@naver.c"};
		for(String mail : mails) {
			boolean b = mail.matches(regexpMail);
			System.out.println(b);
		}
		
		System.out.println("===========================");
		String regexpTel = "[\\d]{3}-[\\d]{4}-[\\d]{4}";
		String[] tels = {"010-3414-1111", "010-44444-1101", "0100000-4444"};
		for(String tel : tels) {
			boolean b = tel.matches(regexpTel);
			System.out.println(b);
		}
		
		
	}

}
