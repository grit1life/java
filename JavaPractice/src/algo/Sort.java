package algo;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numCnt = sc.nextInt();
		int[] arr = new int[numCnt];
		for(int i=0; i<numCnt; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<numCnt; i++) {
			for(int j=i+1; j<numCnt; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
				
			}
		}
		for(int i=0; i<numCnt; i++) {
			System.out.println(arr[i]);
		}
	}

}
