package com.vise.snowdemo.bean;

/**
 * Created by wjj on 2018/7/14 18:58
 * E-Mail ：wjj99@qq.com
 * 描述：
 * <p>
 * Copyright 2018 bejson.com
 * <p>
 * Copyright 2018 bejson.com
 */
/**
 * Copyright 2018 bejson.com
 */

/**
 * Auto-generated: 2018-07-14 18:57:57
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class LoginData extends JsonRootBean {

    private String token;
    private int init_pwd;

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setInit_pwd(int init_pwd) {
        this.init_pwd = init_pwd;
    }

    public int getInit_pwd() {
        return init_pwd;
    }

}