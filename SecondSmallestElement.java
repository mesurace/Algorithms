package com.algorithms;

public class SecondSmallestElement {

	public static void main(String[] args) {
		System.out.println(secondSmallestElement(new int[]{9, 4, 1, 8, 21, 13, 19}));

	}
	
	static int secondSmallestElement(int[] array){
		
		int small=array[0];
		int secondSmall=array[1];  // second small element
		
		if(small>secondSmall){
			small=array[1];
			secondSmall=array[0];
		}
		for(int i=0;i<array.length;i++){
			int temp=array[i];
			if(temp<small){
				secondSmall=small;
				small=temp;
			}else if(temp<secondSmall){
				secondSmall=temp;
			}
		}
		
		return secondSmall;
	}

}
