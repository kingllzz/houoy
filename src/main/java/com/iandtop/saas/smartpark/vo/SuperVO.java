package com.iandtop.saas.smartpark.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @author andyzhao
 */
public abstract class SuperVO implements Serializable{

    private String memo;

    private String def1;
    private String def2;
    private String def3;
    private String def4;
    private String def5;

    private Boolean be_std;
    private String ts;
    private Integer dr;

    //冗余字段,分页
    //从第多少条开始
    private Integer start;

    // 取多少条
    private Integer length;

    //排序列名称
    private String orderColumnName;

    //排序方法asc desc
    private String orderDir;

    //冗余字段
    //树桩结构数据存储子类
    private List children;


//    public abstract String getPKFieldName() ;
//
//    public abstract String getParentPKFieldName();

    public abstract String getPKField() ;

    public abstract String getParentPKField();
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public String getDef3() {
        return def3;
    }

    public void setDef3(String def3) {
        this.def3 = def3;
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4;
    }

    public String getDef5() {
        return def5;
    }

    public void setDef5(String def5) {
        this.def5 = def5;
    }

    public Boolean getBe_std() {
        return be_std;
    }

    public void setBe_std(Boolean be_std) {
        this.be_std = be_std;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public Integer getDr() {
        return dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
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

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }
}
