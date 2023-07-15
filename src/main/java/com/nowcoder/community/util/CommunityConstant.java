package com.nowcoder.community.util;
//常量激活状态
public interface CommunityConstant {

    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;

    /**
     *默认登录时间
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /**
     *勾选记住我的登录时间
     */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 12 * 100;


}
