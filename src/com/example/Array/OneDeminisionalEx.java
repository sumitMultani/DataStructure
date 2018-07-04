package com.example.Array;

public class OneDeminisionalEx {
	
	
	int sum, result;
	int[] marks = {17,42,34,48,23,23,40,56,67,99};
	
	public void getAvg(){
		for(Integer val : marks){
			sum = sum + val;
		}
		
		result = sum/marks.length;
		System.out.println("sum : " +sum +" ,Output : "+result);
	}
	
	public static void main(String [] args) {
		System.out.println("strat");
		OneDeminisionalEx obj = new OneDeminisionalEx();
		obj.getAvg();
	}

}
