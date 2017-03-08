package com.iandtop.saas.smartpark.vo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class RequestResultVO implements Serializable {
    private static final long serialVersionUID = 5454372461726768872L;

    protected Boolean success;

    protected String msg;

    protected String detailMessage;

    protected String statusCode;

    protected String resultDataType;

    protected Object resultData;

    protected Object def1;

    protected Object def2;

    protected Object def3;

    protected Object def4;

    protected Object def5;

    public RequestResultVO() {

    }

    public RequestResultVO(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Boolean getSuccess() {
        if (success == null) {
            success = false;
        }
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }


    public String getMsg() {
        if (msg == null) {
            msg = getSuccess().booleanValue() ? "数据处理成功！" : "数据处理失败！";
        }
        return msg;
    }

    public Object getDef1() {
        return def1;
    }

    public void setDef1(Object def1) {
        this.def1 = def1;
    }

    public Object getDef2() {
        return def2;
    }

    public void setDef2(Object def2) {
        this.def2 = def2;
    }

    public Object getDef3() {
        return def3;
    }

    public void setDef3(Object def3) {
        this.def3 = def3;
    }

    public Object getDef4() {
        return def4;
    }

    public void setDef4(Object def4) {
        this.def4 = def4;
    }

    public Object getDef5() {
        return def5;
    }

    public void setDef5(Object def5) {
        this.def5 = def5;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResultDataType() {
        return resultDataType;
    }

    public void setResultDataType(String resultDataType) {
        this.resultDataType = resultDataType;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Map<String, Object> toMapValue() {
        Map<String, Object> map = new LinkedHashMap();

        map.put("success", getSuccess());
        map.put("msg", getMsg());
        map.put("detailMessage", detailMessage);
        map.put("statusCode", statusCode);
        map.put("resultDataType", resultDataType);
        map.put("resultData", resultData);
        map.put("def1", def1);
        map.put("def2", def2);
        map.put("def3", def3);
        map.put("def4", def4);
        map.put("def5", def5);

        return map;
    }
}
