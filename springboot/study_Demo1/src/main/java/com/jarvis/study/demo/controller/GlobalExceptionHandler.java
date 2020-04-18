package com.jarvis.study.demo.controller;

import com.jarvis.study.demo.bean.GlobalException;
import com.jarvis.study.demo.bean.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @Description:
 * @CreateDate: 2020/3/31 14:40
 * @UpdateUser: jarvis
 * @UpdateDate: 2020/3/31 14:40
 * @UpdateRemark: 更新说明
 * 统一异常处理
 * @Version: 1.0
 */

@ControllerAdvice  //定义一个全局异常处理Handler
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public ResponseData jsonErrorHandler(HttpServletRequest req, GlobalException e) throws Exception {
        ResponseData r = new ResponseData();
        r.setMessage(e.getMessage());
        r.setCode(e.getCode());
        r.setData(null);
        r.setStatus(false);
        return r;
    }
}
