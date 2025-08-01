package techAcademy2;

import java.util.List;



public class UserLogin 
{
	private List<User> user;
	
	
	public UserLogin(List<User> user) {
		super();
		this.user = user;
	}


	public void loginUser(String userName,String pwd)
	{
		for(User usr :user)
		{
			boolean userCheck=usr.getUserName().equals(userName);
			boolean loginPwd=usr.getPassword().equals(pwd);
			
			if(userCheck && loginPwd)
			{
				System.out.println("Login Successfull...");
				return;
			}
		}
		System.err.println("Invalid User....");
	}
}
