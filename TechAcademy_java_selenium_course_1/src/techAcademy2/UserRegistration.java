package techAcademy2;

import java.util.ArrayList;
import java.util.List;

public class UserRegistration 
{
	 List<User> user=new ArrayList<User>();
	
	public void userReg(String userName,String pwd)
	{
		User s1=new User(userName, pwd);
		user.add(s1);
		System.out.println("User Added Succesfully");
	}
	public List<User> getuser()
	{
		return user;
	}
}
