package examples;

public class PrimeNumEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5 ;
		
		for(int index=2;index<=num;index++)
		{
			int rem=num%index;
			
			if(rem==0) {
				System.out.println("num is not prime");
				break;
			}
			System.out.println(" num is prime");
				break;
			
		}
		
		int num2=7;
		
		for(int index=2;index<=num2;index++)
		{
			int rem=num%index;
			
			if(rem==0)
			{
				System.out.println("this is prime no");
				break;
				
			}
			System.out.println("this is not prime no");
			break;
		}
	}

}
