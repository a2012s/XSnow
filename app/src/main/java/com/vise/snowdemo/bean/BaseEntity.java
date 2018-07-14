package com.vise.snowdemo.bean;

/**
 * @author yemao
 * @date 2017/4/9
 * @description 解析实体基类!
 */

public class BaseEntity<T> {
    private static int SUCCESS_CODE = 42440;//成功的code
    private int errno;
    private String errmsg;
    private T data;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public boolean isSuccess() {
        return getErrno() == SUCCESS_CODE;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
