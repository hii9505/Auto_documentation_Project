package Controller;

import Controller.action.Action;
import Controller.action.login.LoginAction;
import Controller.action.login.LoginFormAction;
import Controller.action.login.SignUpAction;
import Controller.action.login.SignUpFormAction;
import Controller.action.mypage.MyPageAction;
import Controller.action.mypage.MyPageFormAction;

public class LoginActionFactory {
	private static LoginActionFactory instance = new LoginActionFactory();
	
	private LoginActionFactory()
	{
		super();
	}
	
	public static LoginActionFactory getInstance()
	{
		return instance;
	}
	
	public Action getAction(String command)
	{
		Action action = null;
		System.out.println("LoginActionFactory :" + command);
		
		if(command.contentEquals("SignUp"))
		{
			action = new SignUpAction();
		}
		else if(command.contentEquals("SignUpForm"))
		{
			action = new SignUpFormAction();
		}
		else if(command.contentEquals("Login"))
		{
			action = new LoginAction();
		}
		else if(command.contentEquals("LoginForm"))
		{
			action = new LoginFormAction();
		}
		else if(command.contentEquals("Mypage"))
		{
			action = new MyPageAction();
		}
		else if(command.contentEquals("MypageForm"))
		{
			action = new MyPageFormAction();
		}
		
		return action;
	}
}
