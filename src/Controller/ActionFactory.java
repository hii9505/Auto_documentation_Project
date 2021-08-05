package Controller;

import Controller.action.Action;
import Controller.action.login.LoginAction;
import Controller.action.login.LoginFormAction;
import Controller.action.login.SignUpAction;
import Controller.action.login.SignUpFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory()
	{
		super();
	}
	
	public static ActionFactory getInstance()
	{
		return instance;
	}
	
	public Action getAction(String command)
	{
		Action action = null;
		System.out.println("ActionFactory :" + command);
		
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
		
		return action;
	}
}
