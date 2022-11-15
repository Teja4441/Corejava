package test;

public class DataTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 70;
		int num2 = 80;
		
		int sum = num1+num2;
		int mul = num1*num2;
		float div =(float) num1/num2;
		
		
		System.out.println("the sum of the two numbers is " + sum);
		System.out.println("the mul of the two numbers is " + mul);
		System.out.println("the div of the two numbers is " + div);
		
		String str1 = "Tony Stark is Iron man";
		
				System.out.println(str1);
				System.out.println("the length of the string is " +str1.length());
				
				char ch1 = str1.charAt(3);
				
				System.out.println(ch1);
				
				char ch2 = str1.charAt(str1.length() -1);
				
				System.out.println("the last char is " + ch2);
				
				
				char ch3=str1.charAt(8);
				
				System.out.println("the middle char is " + ch3);
				
				char ch4=str1.charAt(str1.length() -6);
				
				System.out.println("the last 4th char is " + ch4);
				
				System.out.println("the string in uppercase is" + str1.toUpperCase());
				System.out.println("the string in lowercase is " + str1.toLowerCase()); 
	}
}
