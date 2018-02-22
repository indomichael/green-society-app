import java.util.*;

public class Menu 
{
	public Scanner scan = new Scanner(System.in);
	public String selection;
	public String event;
	public Member member = new Member("","","","","");
	public Menu(Member member)
	{
		this.member = member;
	}
	public void membership()
	{
		System.out.printf("Please select an option%n%n"
				+"Log an event%n"
				+"Pay dues"
				+"Check membership status%n");
		selection = scan.nextLine();
		if(selection.equals("Log an event"))
		{
			System.out.println("Is the event volunteer, social, or meeting");
			event = scan.nextLine();
			member.takeAttendance(event);
		}
		else if(selection.equals("Pay dues"))
		{
			member.payDues();
		}
		else if(selection.equals("Check membership status"))
		{
			System.out.println(member);
			if(member.checkActiveMembership()==false)
			{
				System.out.println("You are not an active member yet");
			}
		}
		
	}
	
