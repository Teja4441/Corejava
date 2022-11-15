package test;

public class DataTypeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		
		int num1 = 30;
		int num2 = 40;
		
		int sum=num1+num2;
		int mul=num1*num2;
		float div=(float) num1/num2;
		
		System.out.println("the sum of the 2 numbers is " +sum);
		System.out.println("the mul of the 2 numbers is " +mul);
		System.out.println("the div of the 2 numbers is " + div);
		
		int num3=20;
		int num4=30;
		
		int sum2=num3+num4;
		int mul2=num3*num4;
		float div2=(float) num3/num4;
		
		System.out.println("the sum of the 2 numbers" +sum2);
		System.out.println("the mul of the 2 numbers" +mul2);
		System.out.println("the div of the 2 numbers" +div2);
		
		int num5 = 70;
		int num6 = 40;
		
		int sum3 = num5+num6;
		int mul3 = num5*num6;
		float div3 = (float) num5/num6;
		
		System.out.println("the sum of the 2 numbers" +sum3);
		System.out.println("the mul of the 2 numbers" +mul3);
		System.out.println("the div of the 2 numbers" +div3);
		
		String str="one plus is the best brand";
		  
		System.out.println("the length of the string "  +str.length());
		
		String str1="apple gadgets are cool";
	     
		System.out.println("the length of the  string "  +str1.length());
		
		char ch1 = str.charAt(6);
		
		System.out.println(ch1);
		
		char ch2=str1.charAt(8);
		
		System.out.println(ch2);
		
		String str2="the worst company is capgemini";
		
		char ch3=str2.charAt(10);
		
		System.out.println(ch3);
		
		char ch4=str2.charAt(str2.length() -1);
		
		System.out.println(ch4);
		
		char ch5=str1.charAt(str1.length() -1);
		System.out.println("the last letter is"+ ch5);
		
		char ch6=str.charAt(str.length() -1);
		System.out.println("the last letter is"+ ch6);
		
		char ch7=str.charAt(str.length() -7);
		System.out.println("the middle letter is "+ ch7);
		
		System.out.println("the upper case of the string" + str.toUpperCase());
		System.out.println(" the upper case of the string" + str1.toUpperCase());
		System.out.println(" the upper case of the string" + str2.toUpperCase());
		System.out.println(" the lower case of the string" + str.toLowerCase());
		System.out.println("the lower case of the string " + str1.toLowerCase());
		
		
		
		
		
		
		
	}

}
