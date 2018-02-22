/*
 * @Michael Indo
 * 
 */
import java.util.*;

public class Welcome {
    public  Scanner scan = new Scanner(System.in);
	public char response;
	LoginScreen loginScreen = new LoginScreen();
	public Welcome() 
	{
		
	}
	public void welcomeScreen() 
	{
		System.out.println("Are you a new member? Y or N");
		response = scan.nextLine().charAt(0);
		if(Character.toUpperCase(response) == 'Y') 
		{
			loginScreen.signUp();
			loginScreen.signIn();
		}
		else
		{
			loginScreen.signIn();
		}
	}
}
