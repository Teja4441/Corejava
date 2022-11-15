package test;

public class ReverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="the batman beats the riddler";
		String result="";
		
		for(int index=str.length()-1;index>=0;index--) {
			char ch=str.charAt(index);
			result = result+ch;
		}
		
     System.out.println("reverse the letters" + result);

	int num = 456789;
	
	int res = 0;
	{
	
	while(num>0) {
		
		int rem = num%10; //4
		
		res = res*10 + rem; //987654
		
		num = num/10;  //0
		
	}
	
	System.out.println("The resulted num is " + res);

	}}}
