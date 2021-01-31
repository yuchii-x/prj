package com.me.prj.response;

/**
 * 回执前端data
 * @author yuchi
 *
 * @param <T>
 */
public class ResponseData<T> {
	private int code = 20000;
	
	private T data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}	
	
	
}
