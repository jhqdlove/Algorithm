package code;

import java.util.List;
import java.util.Scanner;

public class OA111 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = scanner.nextInt();
			int M = scanner.nextInt();
			if (M == 0 && N == 0) {
				break;
			}
			int[] arr1 = new int[N];
			int[] arr2 = new int[M];
			for (int n = N-1; n >= 0; n--) {
				arr1[n] = scanner.nextInt();
			}
			for (int m = M-1; m >= 0; m--) {
				arr2[m] = scanner.nextInt();
			}
			if(M < N){
				System.out.println("Loowater is doomed!");
				continue;
			}
			sort(arr1);
			sort(arr2);
			
			int sum = 0;
			int i= 0,j = 0;
			for(;i<N&&j<M;j++){
				if(arr1[i]<= arr2[j]){
					sum += arr2[j];
					i++;	
				}
			}
			if(i<N){
				System.out.println("Loowater is doomed!");
			}else{
				System.out.println(sum);
			}
		}

	}

	public static void sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}

}
