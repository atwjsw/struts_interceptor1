package com.imooc.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		System.out.println("TimerAction");
		for (int i=1; i<10000; i++) {
			System.out.println(i);
		};				
		return SUCCESS;
		
	}

}
