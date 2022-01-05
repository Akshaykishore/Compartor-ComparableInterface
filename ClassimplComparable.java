package com.company;

public class ClassimplComparable implements Comparable<ClassimplComparable>{
    String name;
    float height;
    int weight;

    public ClassimplComparable(){}
    public ClassimplComparable(String name, float height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ClassimplComparable{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
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

    @Override
    public int compareTo(ClassimplComparable o) {
        ClassimplComparable c = (ClassimplComparable)o;
        if (this.getWeight() > c.getWeight()) {
            return 1;
        } else if (this.getWeight() < c.getWeight()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
