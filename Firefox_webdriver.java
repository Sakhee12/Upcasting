package PrinciplesOfOops;

public class Firefox_webdriver extends Webdriver
{
	public void FirefoxProperties()
	{
		System.out.println("Properties of Firefox");
	}
	
	public void BinaryLocation()
	{
		System.out.println("Specifies the path to the Firefox executable, allowing you to use a specific version or installation of Firefox. ");
	}
	
	public void Profile()
	{
		System.out.println("Defines which Firefox profile to use for the test session. You can use an existing profile or create a new one. ");
	}
	
	public void ProxySetting()
	{
		System.out.println("Configures Firefox to use a proxy server, useful for testing network conditions, geolocation, or hiding the actual IP. ");
	}
}
