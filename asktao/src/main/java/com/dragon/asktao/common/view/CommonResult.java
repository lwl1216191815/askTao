package com.dragon.asktao.common.view;


import java.io.Serializable;

public class CommonResult implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer status = 200;

    private String message = "操作成功";

    private Object result = null;

    public CommonResult(Integer status, String message, Object result) {
        this.status = status;
        this.message = message;
        this.result = result;
    }

    public CommonResult(Integer status, Object result){
        this.result = result;
        this.status = status;
    }

    public CommonResult(Object result){
        this.result = result;
    }

    public CommonResult(){

    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
