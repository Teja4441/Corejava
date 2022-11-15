package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1= new Employee();
		
		E1.name="Center Page Naaki";
		E1.EmpId=800;
		E1.Department="Business Analyst";
		E1.display();
		
		Employee E2=new Employee("buildup bro",367,"HR");
		
		E2.display();
		
		Bank B=new Bank();
		
		B.DisplayBalance();
		
		int bal=B.GetBalance();
		
		System.out.println("The Bal is" +B.GetBalance());
		System.out.println("The Bal is"+bal);
		
		
		
		
		

	}

}
