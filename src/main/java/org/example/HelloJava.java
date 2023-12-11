package org.example;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello Java");
//        new Boy().hello();
        Boy boy = new Boy("Ruby", 80, 1.9f);
//        boy.hello();
//        boy.weight=80;
//        boy.height=1.9f;
        System.out.println(boy.bmi());
    }
}
