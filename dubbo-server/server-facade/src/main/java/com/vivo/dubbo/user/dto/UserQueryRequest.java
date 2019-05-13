package com.vivo.dubbo.user.dto;

import com.vivo.dubbo.user.abs.AbstractRequest;
import lombok.Data;

/**
* 
* @Description: TODO 
* @ClassName: UserQueryRequest
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 16:55
* @version 1.0.0
*/
@Data
public class UserQueryRequest extends AbstractRequest {
    private static final long serialVersionUID = -5261608572536330733L;

    private Integer uid;

}
