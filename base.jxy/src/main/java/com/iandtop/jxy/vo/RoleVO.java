package com.iandtop.jxy.vo;

import com.iandtop.saas.smartpark.vo.SuperVO;

/**
 * @author andyzhao
 */
public class RoleVO extends SuperVO {
    private String pk_role;
    private String pk_corp;
    private String role_code;
    private String role_name;

    public String getPk_role() {
        return pk_role;
    }

    public void setPk_role(String pk_role) {
        this.pk_role = pk_role;
    }

    public String getPk_corp() {
        return pk_corp;
    }

    public void setPk_corp(String pk_corp) {
        this.pk_corp = pk_corp;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String getPKField() {
        return pk_role;
    }

    @Override
    public String getParentPKField() {
        return null;
    }
}
