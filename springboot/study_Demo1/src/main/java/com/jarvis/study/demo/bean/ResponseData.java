package com.jarvis.study.demo.bean;

/**
 * @Description:
 * @CreateDate: 2020/3/31 14:43
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 14:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ResponseData {

    private Boolean status = true;
    private int code =200;
    private String message;
    private Object data;

    public static ResponseData ok(Object data) {
        return new ResponseData(data);
    }
    public ResponseData(Object data) {
        super();
        this.data = data;
    }
    public ResponseData() {
        super();
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
