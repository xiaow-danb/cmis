//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.wondersgroup.commons.json;

import java.io.Serializable;

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -3136052538356961560L;
    public static Integer OK = 200;
    public static Integer FAILURE = 300;
    public static Integer ERROR = 400;
    public static Integer UNLOGIN = 401;
    public static Integer NOAUTHORITY = 403;
    public static Integer BADREQUEST = 500;
    public static String SYS_EXCEPTION = "-1";
    private Integer statusCode;
    private String errorCode;
    private String message;
    private T result;

    public JsonResult() {
        this.statusCode = OK;
        this.message = "";
    }

    public JsonResult(T result) {
        this.result = result;
        this.statusCode = OK;
        this.message = "";
    }

    public JsonResult(String errMsg) {
        this.statusCode = FAILURE;
        this.message = errMsg;
    }

    public JsonResult(Integer statucCode, String errMsg) {
        this.statusCode = FAILURE;
        this.message = errMsg;
    }

    public JsonResult(Integer statucCode, String errorCode, String errMsg) {
        this.statusCode = statucCode;
        this.errorCode = errorCode;
        this.message = errMsg;
    }

    public JsonResult(Integer statucCode, String errMsg, T result) {
        this.result = result;
        this.statusCode = statucCode;
        this.message = errMsg;
    }

    public JsonResult(Integer statucCode, String errorCode, String errMsg, T result) {
        this.result = result;
        this.statusCode = statucCode;
        this.errorCode = errorCode;
        this.message = errMsg;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return this.result;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

	public void setResult(T result) {
		this.result = result;
	}
    
}
