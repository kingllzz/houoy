package com.houoy.framework.base.zookeeper.test.jvmTest;

/**
 * abstract
 */
public class StaticDispatch {
    static class Animal {}
    static class Cat extends Animal{}
    static class Dog extends Animal {}

    public void method(Animal animal) {
        System.out.println("animal");
    }

    public void method(Cat cat) {
        System.out.println("cat");
    }

    public void method(Dog dog) {
        System.out.println("dog");
    }

    public static void main(String[] args) {
        StaticDispatch ref = new StaticDispatch();

        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();

        ref.method(animal); //输出animal
        ref.method(cat); //输出animal
        ref.method(dog); //输出animal

        ref.method(new Cat()); //输出animal
        ref.method(new Dog()); //输出animal
    }
}