package algo;

import java.util.Scanner;

public class MultiplyCnt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[3];
		num[0] = sc.nextInt();
		num[1] = sc.nextInt();
		num[2] = sc.nextInt();
		
		int multi = num[0] * num[1] * num[2];
		int val;
		int[] cnt = new int[10]; 
		for(int i=1; i<(int)(Math.log10(multi)+2) ; i++) {
			val = multi % (int)Math.pow(10, i) / (int)Math.pow(10, i-1);
			switch(val) {
				case 0 : cnt[0]++;
						break;
				case 1 : cnt[1]++;
						break;
				case 2 : cnt[2]++;
						break;
				case 3 : cnt[3]++;
						break;
				case 4 : cnt[4]++;
						break;
				case 5 : cnt[5]++;
						break;
				case 6 : cnt[6]++;
						break;
				case 7 : cnt[7]++;
						break;
				case 8 : cnt[8]++;
						break;
				case 9 : cnt[9]++;
						break;
			}
		}
		for(int i=0; i<cnt.length; i++) {
			System.out.println(cnt[i]);
		}
	}

}
