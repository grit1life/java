package algo;

import java.util.Scanner;


public class MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt, num, max, min;
		int i = 1;
		cnt = sc.nextInt();
		max = sc.nextInt();
		min = max;
		while( i<cnt ) {
			num = sc.nextInt();
			if(max < num) {
				max = num;
			}else if(min > num){
				min = num;
			}
			i++;
		}
		System.out.printf("%d %d", min, max);
	}

}
