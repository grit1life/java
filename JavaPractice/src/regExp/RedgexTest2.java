package regExp;

public class RedgexTest2 {

	public static void main(String[] args) {
		String redgex = "\\w+@\\w+.com";
		boolean b1 = "louw0@naver.com".matches(redgex);
		boolean b2 = "@naver.com".matches(redgex);
		boolean b3 = "louw0@daum.net".matches(redgex);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
