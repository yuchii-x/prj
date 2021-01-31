package com.me.prj.exception;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.me.prj.response.ResponseData;
/**
 * 异常拦截类
 * @author yuchi
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * 拦截函数
	 * @param response
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	ResponseData handleException(HttpServletResponse response, Exception e) {
		ResponseData res = new ResponseData();
		int code;
		String msg;
		if (e instanceof HttpRequestMethodNotSupportedException){
			code = 404;
			msg = "请求资源不存在！";
		} else {
			code = 500;
			msg = "内部错误！请查看后台日志";
		}
		res.setCode(code);
		res.setData(msg);
		return res;
	}
}
