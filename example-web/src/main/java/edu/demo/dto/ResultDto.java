package edu.demo.dto;

public class ResultDto {

    /**
     * 消息代码，默认200
     */
    private int code = 200;

    /**
     * 客户端消息
     */
    private String msg = "";

    /**
     * 返回客户端具体的数据结果
     */
    private Object value;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
