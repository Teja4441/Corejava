package examples;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,20,30,40,50,60,70};
		
		System.out.println("total numbers are " + array.length);
		System.out.println("the middle number is " + array[4]);
		System.out.println("the last number is" + array [array.length -1 ]);
		
		int[] array1 = {20,40,60,80,100,120};
		
		System.out.println("total numbers are " + array1.length);
		System.out.println("the middle no are " + array1[4]);
		System.out.println("the last no is " + array1[array1.length -1]);
		
		String str = "the flash vs ghost";
		
		String[] array3=str.split("");
		
		System.out.println("the total no of letters" + str.length());
		System.out.println("the middle letter is " +array3[10]);
		System.out.println("the last word is "+ array3[array3.length -1]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
