package com.jarvis.study.demo.bean;

/**
 * @Description:
 * @CreateDate: 2020/3/31 20:19
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 20:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ParamException extends GlobalException {//参数异常
    private static final long serialVersionUID = 6021390821349937519L;
    public ParamException(String message) {
        super(message, ResponseCode.PARAM_ERROR_CODE.getCode());
    }
}
