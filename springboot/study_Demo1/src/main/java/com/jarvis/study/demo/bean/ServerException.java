package com.jarvis.study.demo.bean;

/**
 * @Description:
 * @CreateDate: 2020/3/31 20:19
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 20:19
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ServerException extends GlobalException {//服务器异常
    private static final long serialVersionUID = -1355046108056594333L;
    public ServerException(String message) {
        super(message, ResponseCode.SERVER_ERROR_CODE.getCode());
    }

}
