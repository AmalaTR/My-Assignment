package week1.day2;

public class Browser {
	
	String browserName;
	float browserVersion;

	public void launchBrowse()
	{
		System.out.println("Browser lunched successfully");
		System.out.println("Browser Name is "+browserName);
		System.out.println("Browser version is "+browserVersion);
		
							
	}
	
	public void loadUrl()
	{
		System.out.println("------------------");
		System.out.println("Applicaion url loaded successfully");
	}
	
	
	public static void main(String[] args)
	{
				
		boolean ifAny =true;
		System.out.println("If Any"+ifAny);
		Browser edge = new Browser();
		System.out.println("-----Edge------");
		edge.browserName = "Edge";
		edge.browserVersion = 1.01f;
		edge.launchBrowse();
		edge.loadUrl();	
		
		
	}
	
}
