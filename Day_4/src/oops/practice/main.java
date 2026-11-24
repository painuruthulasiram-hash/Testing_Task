package oops.practice;

public class main {
	public static void main(String[]args) 
	{
		LoginPage login=new LoginPage("admin","password");
		login.login();
		HomePage home=new HomePage();
		home.verifyhomepage();
		home.logout();
		
	

}
}