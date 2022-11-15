package examples;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="mahaan is famous leader";
		int count = 0;
		
		for(int index=0;index<str.length();index++) {
			
			char ch=str.charAt(index);
			
			switch(ch) {
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			count++;
			break;
			}
		}
		System.out.println("the total no of vowels" + count);

	}

}
