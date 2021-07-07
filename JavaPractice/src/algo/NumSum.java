package algo;

import java.util.Scanner;

public class NumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numSize = sc.nextInt();
		int num = sc.nextInt();
		int val, sum=0;
		for(int i=((int)Math.log10(num)); i>=0; i--) {
			val = num/((int)Math.pow(10, i)); //각자리의 숫자
			num -= val*(int)Math.pow(10, i);  //값을 제외해준다
			sum += val;
		}
		System.out.println(sum);
	}

}
