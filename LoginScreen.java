import java.util.ArrayList;
import java.util.Scanner;

public class LoginScreen 
{
	public  Scanner scan = new Scanner(System.in);
	public char response;
	public String username;
	public String password;
	public String name;
	public String firstName;
	public String lastName;
	public String email;
	public boolean match = false;
	public ArrayList<Member> members = new ArrayList<Member>();
	public Member member;
	public Member login = new Member("","","","","");
	
	public LoginScreen()
	{
		
	}
	public void signUp()
	{
		System.out.println("Enter a userame:");
		username = scan.nextLine();
		System.out.println("Enter a password:");
		password = scan.nextLine();
		System.out.println("Confirm password:");
		while(!password.equals(scan.nextLine())) 
		{
			System.out.println("Passwords don't match. Try again. Enter a password:");
			password = scan.nextLine();
			System.out.println("Confirm password");
		}
		System.out.println("What is your first and last name?");
		name = scan.nextLine();
		String[] tokens = name.split(" ");
		firstName = tokens[0].trim();
		lastName = tokens[1].trim();
		System.out.println("Enter an email address");
		email = scan.nextLine();
		Member member = new Member(username, password, firstName, lastName, email);
		members.add(member);
	}
	public void signIn()
	{
		System.out.println("Enter your username");
		username = scan.nextLine();
		System.out.println("Enter your password");
		password = scan.nextLine();
		boolean match = false;
		while(match == false)
		{
			for(Member m : members)
			{
				if(username == m.getUsername() && password == m.getPassword())
				{
					match = true;
					login = m;
					break;
				}
			}
			if(match == false)
			{
				System.out.println("Sorry. That username or password is incorrect. Please try again.");
			}		
		}
		Menu menu = new Menu(login);
		menu.membership();
		
	}
}
