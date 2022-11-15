package examples;

public class ReverseEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="the batman beats the riddler";
		String result=" ";
		
		for(int index=str.length() -1;index>=0;index--) {
			
			char ch=str.charAt(index);
			result=result+ch;
		}
		System.out.println("reverse the string" + result);
		
		int num =123456789;
		int res=0;
		
		int rem=num%10;
		
		res=res*10+rem;
		System.out.println("print reverse no" + rem);
		
	}

}
