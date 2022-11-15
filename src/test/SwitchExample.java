package test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="the batman beats the riddler";
		int count=0;
		
		for (int index=0;index<str.length();index++) {
			
			char ch=str.charAt(index);
			
			switch(ch) {
			
			
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
				count++;
				break;
			
			}
		}
 
		System.out.println("the no of vowels" + count);
	}

}
