package oops.practice;

public class LoginPage extends BasePage
{
	private String username;
	private String password;
	public LoginPage(String username, String password) 
	{
		this.username=username;
		this.password=password;
	}
	public void username()
	{
		System.out.println("enter the username:" +username);
	}
	public void password()
	{
		System.out.println("enter the password:" +password);
	}
	public void login()
	{
		openpage();
		username();
		password();
		clickbutton();
		System.out.println("login completed");
		
		
	}

}
