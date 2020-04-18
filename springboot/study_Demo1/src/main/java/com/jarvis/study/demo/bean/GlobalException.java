package com.jarvis.study.demo.bean;

/**
 * @Description:
 * @CreateDate: 2020/3/31 20:18
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 20:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class GlobalException extends Exception {//全局异常

    private static final long serialVersionUID = -5701182284190108797L;
    private int code;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public GlobalException(String message) {
        super(message);
    }
    public GlobalException(String message, int code) {
        super(message);
        this.code = code;
    }
}
