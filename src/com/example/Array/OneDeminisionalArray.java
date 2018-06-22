package com.example.Array;

public class OneDeminisionalArray {
	public static void main(String args[]) {

		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		
		int b[] = new int[]{1,2,4,5,8,9,6,3,7};

		// printing array
		for (int i = 0; i < a.length; i++)
			// length is the property of array
			System.out.println(a[i]);
			System.out.println("a -> length : "+ a.length);
			System.out.println("b -> length : "+ b.length);

	}
}