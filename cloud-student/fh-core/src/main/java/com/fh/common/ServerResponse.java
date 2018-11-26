/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:ServerResponse.java 
 * 包名:com.fh.shop.admin.common 
 * 创建日期:2018年10月18日下午5:22:26 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.fh.common;

import java.io.Serializable;

/** 
 * <pre>项目名称：shop-admin    
 * 类名称：ServerResponse    
 * 类描述：    
 * 创建人：于笑扬 yuxy123@gmail.com    
 * 创建时间：2018年10月18日 下午5:22:26    
 * 修改人：于笑扬 yuxy123@gmail.com     
 * 修改时间：2018年10月18日 下午5:22:26    
 * 修改备注：       
 * @version </pre>    
 */
public class ServerResponse<T> implements Serializable{

	private static final long serialVersionUID = 4557960103144779973L;

	private int code;
	
	private String msg;
	
	private T data;
	
	public ServerResponse() {
		
	}
	
	private ServerResponse(int code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static ServerResponse error(int code, String msg) {
		return new ServerResponse(code, msg, null);
	}
	
	public static ServerResponse error() {
		return new ServerResponse(SystemEnum.ERROR.getCode(), SystemEnum.ERROR.getMsg(), null);
	}
	
	public static ServerResponse error(SystemEnum systemEnum) {
		return new ServerResponse(systemEnum.getCode(), systemEnum.getMsg(), null);
	}
	
	public static <T> ServerResponse<T> success(T data) {
		return new ServerResponse<T>(SystemEnum.SUCCESS.getCode(), SystemEnum.SUCCESS.getMsg(), data);
	}
	
	public static ServerResponse success() {
		return new ServerResponse(SystemEnum.SUCCESS.getCode(), SystemEnum.SUCCESS.getMsg(), null);
	}

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}
	
	
}
