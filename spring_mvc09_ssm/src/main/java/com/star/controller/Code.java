package com.star.controller;

public class Code {
    //CRUD状态码
    //成功
    public static final Integer SAVE_OK = 1001;
    public static final Integer DELETE_OK = 2001;
    public static final Integer UPDATE_OK = 3001;
    public static final Integer SELECT_OK = 4001;
    //失败
    public static final Integer SAVE_ERR = 1000;
    public static final Integer DELETE_ERR = 2000;
    public static final Integer UPDATE_ERR = 3000;
    public static final Integer SELECT_ERR = 4000;

    //异常状态码
    public static final Integer SYSTEM_ERR = 5000;
    public static final Integer SYSTEM_TIMEOUT_ERR = 5100;
    public static final Integer SYSTEM_UNKNOW_ERR = 5200;
    public static final Integer BUSINESS_ERR = 6000;

}
