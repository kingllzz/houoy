package com.houoy.cms.vo;

import org.springframework.data.annotation.Id;

/**
 * 此类没有使用getter和setter方法，保持简洁
 */
public class EssayVO extends SuperVO {
    @Id
    private String id;

    private String title;
    private String subTitle;
    private String content;

    public EssayVO() {
    }

    @Override
    public String getPKField() {
        return null;
    }

    @Override
    public String getParentPKField() {
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}






