package com.vivo.dubbo.user;

import com.vivo.dubbo.user.dto.UserQueryRequest;
import com.vivo.dubbo.user.dto.UserQueryResponse;

/**
 * @author zhangguidong
 * @version 1.0.0
 * @Description:
 * @ClassName: UserQueryFacade
 * @ProjectName dubbo-user
 * @date 2019/5/10 16:51
 */
public interface UserQueryFacade {
    /**
     * 根据用户id来查询用户信息
     * @param request
     * @return
     */
    public UserQueryResponse getUserById(UserQueryRequest request);
}
