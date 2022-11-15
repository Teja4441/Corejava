package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10,20,30,40,50};
		
		System.out.println("Total number are " + array1.length);
		System.out.println("the second number is " + array1[2]);
		System.out.println("the last number is " + array1[array1.length -1]);

		
		String str1="the batman vs riddler";
		
				String[] array2 = str1.split(" ");
		
				System.out.println("the middle word is " + array2[1]);
				System.out.println("the last word is " + array2[array2.length -1]);
	}

}
