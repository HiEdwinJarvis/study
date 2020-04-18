package com.jarvis.study.demo.bean;

/**
 * @Description:
 * @CreateDate: 2020/3/31 20:18
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 20:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public enum  ResponseCode {

    PARAM_ERROR_CODE(400),
    SERVER_ERROR_CODE(500);
    private int code;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    private ResponseCode(int code) {
        this.code = code;
    }
}
