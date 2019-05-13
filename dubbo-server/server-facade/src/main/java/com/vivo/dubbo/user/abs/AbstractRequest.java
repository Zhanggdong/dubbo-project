package com.vivo.dubbo.user.abs;

import java.io.Serializable;

/**
* 
* @Description: TODO 
* @ClassName: AbstractRequest
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 16:52
* @version 1.0.0
*/
public abstract class AbstractRequest implements Serializable {
    private static final long serialVersionUID = 5940528100818882546L;

    @Override
    public String toString() {
        return "AbstractRequest{}";
    }
}
