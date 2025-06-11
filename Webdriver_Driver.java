package PrinciplesOfOops;

public class Webdriver_Driver {

	public static void main(String[] args) 
	{
		// Inheritance_Upcasting
		Webdriver w1 = new Chrome_Webdriver();
		w1.ConfigurationManagement();
				
		Webdriver w2 = new Firefox_webdriver();
		w2.DynamicLoading();
		
		//Normal Obeject
		
		Webdriver w3 = new Webdriver();
		w3.Flexibility();
		
		Chrome_Webdriver c1 = new Chrome_Webdriver();
		c1.ChromeProperties();
		
		Firefox_webdriver f1 = new Firefox_webdriver();
		f1.BinaryLocation();
				
	}

}
