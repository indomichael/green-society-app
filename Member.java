/* @author MICHAEL INDO
 * 02/11/2018
 */
import java.util.*;

public class Member {
	String firstName;
	String lastName;
	String email;
	String username;
	String password;
	int[] attendance = new int[4];
	public Member(String username, String password, String firstName, String lastName, String email) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public void takeAttendance(String type) 
	{
		if(type.equals("meeting")) { 
			attendance[0]++;
			System.out.println("You logged one meeting!");
		}else if(type.equals("social")) {
			attendance[1]++;
			System.out.println("You logged one social event!");
		}else if(type.equals("volunteer")) {
			attendance[2]++;	
			System.out.println("You logged one volunteer event!");
		}
		System.out.println(toString());
	}
	public void payDues() 
	{
		attendance[3] = 1;
		System.out.println("You paid your membership dues!");
	}
	public boolean checkActiveMembership() 
	{
		boolean isTrue = true;
		for(int i = 0; i < 3; i++) {
			if(attendance[i]<4)
				isTrue = false;
		}
		if(attendance[4] == 0)
			isTrue = false;
		return isTrue;	
		
	}
	public String toString() 
	{
		String output = String.format("Social events: %d%n"
				+ "Social Events: %d%n"
				+ "Volunteer events: %d%n", attendance[0], attendance[1], attendance[2]);
		if(attendance[4] == 1)
			output += String.format("Dues paid? YES");
		if(attendance[4] == 0)
			output += String.format("Dues paid? NO");
		return output;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public int[] getAttendance() {
		return attendance;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAttendance(int[] attendance) {
		this.attendance = attendance;
	}
}
