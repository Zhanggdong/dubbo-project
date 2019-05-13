package com.vivo.dubbo.user.service;

import com.vivo.dubbo.user.UserQueryFacade;
import com.vivo.dubbo.user.constants.ResponseCodeEnum;
import com.vivo.dubbo.user.dal.entity.User;
import com.vivo.dubbo.user.dto.UserQueryRequest;
import com.vivo.dubbo.user.dto.UserQueryResponse;
import com.vivo.dubbo.user.exception.ExceptionUtil;
import com.vivo.dubbo.user.exception.ServiceException;
import com.vivo.dubbo.user.exception.ValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
* 
* @Description: TODO 
* @ClassName: UserQueryFacadeImpl
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 17:10
* @version 1.0.0
*/
//@Service("userQueryFacade")
public class UserQueryFacadeImpl implements UserQueryFacade {
    Logger logger= LoggerFactory.getLogger(UserQueryFacadeImpl.class);

    @Override
    public UserQueryResponse getUserById(UserQueryRequest request) {
        logger.info("begin UserQueryService.getUserById,request:【"+request+"】");
        UserQueryResponse response = new UserQueryResponse();
        try {
            beforeValidate(request);
            response.setCode(ResponseCodeEnum.SYS_SUCCESS.getCode());
            response.setMobile(ResponseCodeEnum.SYS_SUCCESS.getMsg());
            User user = getUserByUid(request.getUid());
            if(user!=null){
                response.setAvatar(user.getAvatar());
                response.setSex(user.getSex());
                response.setRealName(user.getRealname());
                response.setMobile(user.getMobile());
                return response;
            }
            response.setCode(ResponseCodeEnum.QUERY_DATA_NOT_EXIST.getCode());
            response.setMsg(ResponseCodeEnum.QUERY_DATA_NOT_EXIST.getMsg());
            return response;
        }catch (Exception e){
            ServiceException serviceException=(ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMsg(serviceException.getErrorMessage());
        }finally {
            logger.info("getUserById response:【"+response+"】");
        }
        return response;
    }

    // 可以其他地方获取
    private User getUserByUid(Integer uid) {
        User user = new User();
        user.setId(uid);
        user.setUsername("vivo x23");
        user.setRealname("vivo");
        user.setAvatar("XXXXXXXXXXXXXXXX -XXX");
        user.setSex("man");
        user.setStatus(1);
        return user;
    }

    private void beforeValidate(UserQueryRequest request) {
        if(null==request){
            throw new ValidateException("请求对象为空");
        }
        if(request.getUid()==null||request.getUid().intValue()==0){
            throw new ValidateException("用户id不能为空");
        }
    }
}
