package algo;

import java.util.Scanner;

public class NumCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ten, one, num, cnt=0;
		int initNum = sc.nextInt();
		num = initNum;
		while(true) {
			ten = num / 10;
			one = num % 10;
			num = one*10+(ten+one)%10;
			cnt++;
			if(num == initNum) {
				break;
			}
		}
		System.out.println(cnt);
	}

}
