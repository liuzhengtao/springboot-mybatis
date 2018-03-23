package com.taotao3.www.entity;

/**
 * Created by YM10095 on 2018/3/22.
 */
public class DbConfig {
    private Integer id;

    private String ip;

    private String mysqlPort;

    private String userName;

    private String passWd;

    private String dbName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMysqlPort() {
        return mysqlPort;
    }

    public void setMysqlPort(String mysqlPort) {
        this.mysqlPort = mysqlPort;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}