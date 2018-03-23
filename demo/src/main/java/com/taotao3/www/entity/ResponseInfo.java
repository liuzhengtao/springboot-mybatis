package com.taotao3.www.entity;

import java.util.List;

/**
 * Created by YM10095 on 2018/3/23.
 */
public class ResponseInfo<T> {
    private String syscode;
    private String message;
    private List<T>  data;

    public ResponseInfo(String syscode, String message) {
        this.syscode = syscode;
        this.message = message;
    }

    public ResponseInfo(String syscode, String message, List<T> data) {
        this.syscode = syscode;
        this.message = message;
        this.data = data;
    }

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
