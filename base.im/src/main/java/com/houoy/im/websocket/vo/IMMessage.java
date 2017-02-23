package com.houoy.im.websocket.vo;

/**
 * Created by andyzhao on 2017-02-23.
 * 浏览器向服务器传送消息，用该类进行接收
 */
public class IMMessage {
    private String from;
    private String to;
    private String content;
    private String time;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}


