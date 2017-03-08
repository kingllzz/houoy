package com.iandtop.saas.smartpark.vo;

import java.io.Serializable;
import java.sql.Timestamp;

public class UserVO implements Serializable {
    public static String USERCODE = "user_code";
    public static String PASSWORD = "user_password";

    public static String Default_PassWord = "1";

    protected String pk_user;
    protected String pk_role;
    protected String user_code;
    protected String user_name;
    protected String user_password;
    protected String email;
    protected String mobile;
    protected String be_locked;
    protected Timestamp abletime;
    protected Timestamp disabletime;

    //----------------------------------
    //冗余字段
    //----------------------------------
    protected boolean be_enterprise;
    protected boolean be_me;
    protected boolean be_operation;
    protected boolean be_console;
    protected boolean be_actived;
    protected String locked_reason;
    protected Timestamp reg_ts;
    protected Timestamp last_login_ts;
    protected String encrypted_password;
    protected String avatar_url;

    //冗余字段,分页
    //从第多少条开始
    private Integer start;

    // 取多少条
    private Integer length;

    //排序列名称
    private String orderColumnName;

    //排序方法asc desc
    private String orderDir;

    public UserVO() {
    }

    public String getPk_role() {
        return pk_role;
    }

    public void setPk_role(String pk_role) {
        this.pk_role = pk_role;
    }

    public Timestamp getAbletime() {
        return abletime;
    }

    public void setAbletime(Timestamp abletime) {
        this.abletime = abletime;
    }

    public Timestamp getDisabletime() {
        return disabletime;
    }

    public void setDisabletime(Timestamp disabletime) {
        this.disabletime = disabletime;
    }

    public String getPk_user() {
        return pk_user;
    }

    public void setPk_user(String pk_user) {
        this.pk_user = pk_user;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public boolean isBe_enterprise() {
        return be_enterprise;
    }

    public void setBe_enterprise(boolean be_enterprise) {
        this.be_enterprise = be_enterprise;
    }

    public boolean isBe_me() {
        return be_me;
    }

    public void setBe_me(boolean be_me) {
        this.be_me = be_me;
    }

    public boolean isBe_operation() {
        return be_operation;
    }

    public void setBe_operation(boolean be_operation) {
        this.be_operation = be_operation;
    }

    public boolean isBe_console() {
        return be_console;
    }

    public void setBe_console(boolean be_console) {
        this.be_console = be_console;
    }

    public boolean isBe_actived() {
        return be_actived;
    }

    public void setBe_actived(boolean be_actived) {
        this.be_actived = be_actived;
    }

    public String getBe_locked() {
        return be_locked;
    }

    public void setBe_locked(String be_locked) {
        this.be_locked = be_locked;
    }

    public String getLocked_reason() {
        return locked_reason;
    }

    public void setLocked_reason(String locked_reason) {
        this.locked_reason = locked_reason;
    }

    public Timestamp getReg_ts() {
        return reg_ts;
    }

    public void setReg_ts(Timestamp reg_ts) {
        this.reg_ts = reg_ts;
    }

    public Timestamp getLast_login_ts() {
        return last_login_ts;
    }

    public void setLast_login_ts(Timestamp last_login_ts) {
        this.last_login_ts = last_login_ts;
    }

    public String getEncrypted_password() {
        return encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getOrderColumnName() {
        return orderColumnName;
    }

    public void setOrderColumnName(String orderColumnName) {
        this.orderColumnName = orderColumnName;
    }

    public String getOrderDir() {
        return orderDir;
    }

    public void setOrderDir(String orderDir) {
        this.orderDir = orderDir;
    }
}
