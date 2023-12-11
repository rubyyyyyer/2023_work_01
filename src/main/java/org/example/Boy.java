package org.example;

public class Boy {
    String name;
    float weight;
    float height;

    public Boy(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Boy(String name, float weight, float height) {
        this(weight, height);
        this.name = name;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("嗨!你好JAVA!(記起來)");
    }
}
