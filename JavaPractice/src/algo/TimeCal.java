package algo;

import java.util.Scanner;

public class TimeCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		
		if(minute-45<0) {
			hour--;
			minute = minute + 60-45;
			if(hour<0) {
				hour = hour+24;
			}
		}else {
			minute = minute - 45;	
		}
		System.out.printf("%d %d\n", hour, minute);
	}

}
