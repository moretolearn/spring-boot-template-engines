package com.moretolearn;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@ControllerAdvice
public class PageNot {

	@ExceptionHandler(NoResourceFoundException.class)
	public String pageNot(NoResourceFoundException resourceFoundException) {
		return "pagenot";
	}
}
