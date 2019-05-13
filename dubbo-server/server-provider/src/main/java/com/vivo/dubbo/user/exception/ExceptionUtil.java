package com.vivo.dubbo.user.exception;

import com.vivo.dubbo.user.constants.ResponseCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 
* @Description: TODO 
* @ClassName: ExceptionUtil
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 17:24
* @version 1.0.0
*/
public class ExceptionUtil {
    private static Logger logger = LoggerFactory.getLogger(ExceptionUtil.class);

    /**
     * 将下层抛出的异常转换为resp返回码
     *
     * @param e Exception
     * @return
     */
    public static Exception handlerException4biz(Exception e) {
        Exception ex = null;
        if (!(e instanceof Exception)) {
            return null;
        }
        if (e instanceof ValidateException) {
            ex = new ServiceException(((ValidateException) e).getErrorCode(), ((ValidateException) e).getErrorMessage());
        }else if (e instanceof Exception) {
            ex = new ServiceException(ResponseCodeEnum.SYSTEM_BUSY.getCode(),
                    ResponseCodeEnum.SYSTEM_BUSY.getMsg());
        }
        logger.error("ExceptionUtil.handlerException4biz,Exception=" + e.getMessage(), e);
        return ex;
    }
}
