package MergeAlgorithm;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(iterativeFibo(20)));

	}

	public static int[] iterativeFibo(int n) {
		int[] fibo = new int[n];
		fibo[0] = 0;
		if(n==1){
			return fibo;
		}
		fibo[1] = 1;
		
		int count = 2;
		while (count < n) {
			fibo[count] = fibo[count - 1] + fibo[count -2];
			count++;
		}
		
		return fibo;
	}
	
	
	
	
	

}
