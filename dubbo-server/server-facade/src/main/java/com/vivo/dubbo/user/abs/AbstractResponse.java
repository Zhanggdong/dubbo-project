package com.vivo.dubbo.user.abs;

import java.io.Serializable;

/**
* 
* @Description: TODO 
* @ClassName: AbstractResponse
* @ProjectName dubbo-user
* @author zhangguidong
* @date 2019/5/10 16:54
* @version 1.0.0
*/
public abstract class AbstractResponse implements Serializable {
    private static final long serialVersionUID = 6500109890661624533L;

    /**
     * 返回码（请求）
     */
    private String code;

    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "AbstractResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
