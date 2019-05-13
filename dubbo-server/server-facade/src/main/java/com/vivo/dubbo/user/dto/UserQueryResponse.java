package com.vivo.dubbo.user.dto;

import com.vivo.dubbo.user.abs.AbstractResponse;
import lombok.Data;

/**
* 
* @Description: TODO 
* @ClassName: UserQueryResponse
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 16:56
* @version 1.0.0
*/
@Data
public class UserQueryResponse extends AbstractResponse {

    private String realName;

    private String avatar;

    private String mobile;

    private String sex;
}
