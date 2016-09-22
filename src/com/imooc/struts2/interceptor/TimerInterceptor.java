package com.imooc.struts2.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TimerInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		
		System.out.println("TimerInterceptor");
		long t1 = System.currentTimeMillis();
		String result = ai.invoke();				
		long t2 = System.currentTimeMillis();
		System.out.println("Action运行时间： " + (t2-t1));
		return result;
	}

}
