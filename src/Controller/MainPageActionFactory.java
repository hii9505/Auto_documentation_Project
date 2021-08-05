package Controller;

import Controller.action.Action;
import Controller.action.MainPageFormAction;
import Controller.action.mypage.MyPageViewAction;


public class MainPageActionFactory {
	private static MainPageActionFactory instance = new MainPageActionFactory();
	
	private MainPageActionFactory()
	{
		super();
	}
	
	public static MainPageActionFactory getInstance()
	{
		return instance;
	}
	
	public Action getAction(String command)
	{
		Action action = null;
		System.out.println("MainPageActionFactory :" + command);
		
		if(command.contentEquals("MainPageFormAction"))
		{
			action = new MainPageFormAction();
		}
		else if(command.contentEquals("MypageView"))
		{
			//action = new MyPageViewAction();
		}
		
		return action;
	}
}
