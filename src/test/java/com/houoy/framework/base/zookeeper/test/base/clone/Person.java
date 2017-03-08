package com.houoy.framework.base.zookeeper.test.base.clone;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017-03-02.
 */
public  class Person implements Cloneable,Comparable<Person>{

    private int age ;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person() {}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Person)super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false ;
        }

        if(obj instanceof Person){
            Person person = (Person) obj;
            if(age==person.age && name.equals(person.name)){
                return true;
            }
        }
        return false ;
    }

    @Override
    public int compareTo(Person o) {
        if(age>o.age){
            return 1;
        }else if(age == o.age){
            return 0;
        }
        return -1;
    }
}