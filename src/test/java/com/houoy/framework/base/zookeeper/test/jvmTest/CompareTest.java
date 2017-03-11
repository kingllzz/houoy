package com.houoy.framework.base.zookeeper.test.jvmTest;

import java.util.List;

public class CompareTest {

    public static void main(String[] args) {

        Integer ii = 1002;
        Integer isi = 1002;
        System.out.println(isi==ii);

        String a = "asdfa";
        String b= "asdfa";
        System.out.println(a==b);

        String bb = new String("a");
        String aa = new String("asdfa");
        System.out.println(aa==a);

        int ia = ii;
        System.out.println(ia==ii);


        Integer iii = 1111 ;
        int iiii = 1111 ;
        Integer iisi = iiii ;

        System.out.println(iii==iisi);


        Integer ggg = 111 ;
        Integer gggg = 111 ;
        int ggggg = 1111 ;
        Integer gggggg = 1111 ;
        System.out.println(ggg==gggg);//相等，java中为了提升效率，会把-127-128缓存
        System.out.println(ggg==ggggg);//不等
        System.out.println(gggggg==ggggg);//相等，gggggg会自动拆包
    }
}