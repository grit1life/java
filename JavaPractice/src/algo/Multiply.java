package algo;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int hundred = b/100;
		int ten = b/10-hundred*10;
		int one = b - hundred*100 - ten*10;
		System.out.println(a*one);
		System.out.println(a*ten);
		System.out.println(a*hundred);
		System.out.println(a*b);
	}

}
