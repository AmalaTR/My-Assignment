package week1.day2;

public class CheckNumberIsPostive {
	int a = 10;
	
	public void checknNumber(int a) {
		if(a>0) 
		{
			System.out.println("The number "+a+" is Positive");
		}
		else if(a<0) 
		{
			
			System.out.println("The number "+a+" is Negative");
		}
		else
		{
			System.out.println("The number "+a+" is Zero");
		
		}
		
	}
		
		public static void main(String[] args) {
			
			 CheckNumberIsPostive check = new  CheckNumberIsPostive();
			 check.checknNumber(10);
			 check.checknNumber(0);
			 check.checknNumber(-1);
			 			 
		}
	}
