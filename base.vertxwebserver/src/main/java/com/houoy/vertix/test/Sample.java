package com.houoy.vertix.test;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017-02-19.
 */
public class Sample {
    // Convenience method so you can run it in your IDE
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.createHttpServer().requestHandler(req -> {
            InetAddress addr = null;
            String ip = "";
            String address = "";
            try {
                addr = InetAddress.getLocalHost();
                ip = addr.getHostAddress().toString();//获得本机IP
                address = addr.getHostName().toString();//获得本机名称
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } finally {
                req.response().putHeader("content-type", "text/html").end("<html><body><h1>Hello from vert.x!"+ip+"</h1></body></html>");
            }
        }).listen(8080);
    }
}
