package com.company;

public class ClassWithoutImplCompartorOrComparable {
    String name;
    float height;
    int weight;

    public ClassWithoutImplCompartorOrComparable(String name, float height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public ClassWithoutImplCompartorOrComparable(){}

    @Override
    public String toString() {
        return "ClassWithoutImplCompartorOrComparable{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
