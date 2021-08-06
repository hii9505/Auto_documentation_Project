package Controller;

import Controller.action.Action;
import Controller.action.mydocument.WorkReportListAction;
import Controller.action.mydocument.WorkReportListFormAction;

public class MyDocumentActionFactory {
	private static MyDocumentActionFactory instance = new MyDocumentActionFactory();
	
	private MyDocumentActionFactory()
	{
		super();
	}
	
	public static MyDocumentActionFactory getInstance()
	{
		return instance;
	}
	
	public Action getAction(String command)
	{
		Action action = null;
		System.out.println("MyDocumentActionFactory :" + command);
		
		if(command.contentEquals("workreport"))
		{
			//action = new WorkReportFormAction();
		}
		else if(command.contentEquals("workreportlist"))
		{
			action = new WorkReportListAction();
		}
		else if(command.contentEquals("workreportlistForm"))
		{
			action = new WorkReportListFormAction();
		}
		
		return action;
	}
	
}
