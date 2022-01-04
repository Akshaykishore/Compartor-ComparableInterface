package com.company;

import java.util.Comparator;

public class CustomClass implements Comparator {
    String name;
    float height;
    int weight;

    public CustomClass(){

    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public CustomClass(String name, float height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
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

    @Override
    public int compare(Object o1, Object o2) {
        CustomClass c1 = (CustomClass) o1;
        CustomClass c2 = (CustomClass) o2;
        if(c1.getWeight()> c2.getWeight()){
            // Depends on +ve will return ascending order if we do vice versa it will be changed to descending
            return -1;
        }else if (c1.getWeight() <  c2.getWeight()){
            // Depends on -ve will return descending order if we do vice versa it will be changed to ascending
            return 1;
        }else {
            return 0;
        }
    }
}
