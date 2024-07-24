package cn.edu.xcu.advice;

import cn.edu.xcu.util.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: WeiJiang
 * @Description: SpringMVC 的异常处理器
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result("服务器故障，请稍后再试！");
    }
}
