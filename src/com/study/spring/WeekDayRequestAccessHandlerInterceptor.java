package com.study.spring;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class WeekDayRequestAccessHandlerInterceptor extends
		HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		Calendar mydate = Calendar.getInstance();
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getAuthType());
		int dow = mydate.get(Calendar.DAY_OF_WEEK);
		boolean isWeekday = ((dow >= Calendar.MONDAY) && (dow <= Calendar.FRIDAY));
		if (isWeekday) {
			return true;
		} else {
			response.getWriter()
					.write("The Website is closed on weekend.Please try accessing it on week days. Sorry for inconvinience");
			return false;
		}

	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("i am in postHandle :"+request.getRequestURI().toString());
	}
	
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("i am in afterCompletion:"+request.getRequestURI().toString());
	}

}
