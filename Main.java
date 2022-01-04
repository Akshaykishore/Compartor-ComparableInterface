package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        //Normal Arrays.sort which will take all primitive data types for sorting and will sort in ascending order
	    int[] a = new int[]{5,2,62,1,4,1,89};
        Arrays.sort(a);
        for(int i:a){
            System.out.println(i);
        }

        //Created custom class and created a array but that object cannot be sorted due to classcastexception
        CustomClass akshay = new CustomClass("Akshay", 5.11f, 85);
        CustomClass heema = new CustomClass("Heema", 5.5f, 55);
        CustomClass raju = new CustomClass("Rajesh", 5.8f, 80);

        CustomClass[] person = {akshay,heema,raju};

        //1. Creating a object for class that implements comparator interface and compare method override in it.
        CustomClass c = new CustomClass();
        Arrays.sort(person,c);
        /*
        2. Passing anonymous inner class itself as a second param instead of creating an empty instance variable in 23 line
        Arrays.sort(person, new CustomClass());
        3. Using lambda function itself as a second param for sort instead of object ref
        Arrays.sort(person, (c,b) -> Integer.compare(c.getWeight(),b.getWeight()));
        */
        for(int i=0;i< person.length;i++){
            System.out.println(person[i]);
        }

        //4. If the class that we are creating does not want to implement any of the interface then we could do directly like this
        ClassWithoutImplCompartorOrComparable akshay1 = new ClassWithoutImplCompartorOrComparable("Akshay", 5.11f, 85);
        ClassWithoutImplCompartorOrComparable heema1 = new ClassWithoutImplCompartorOrComparable("Heema", 5.5f, 55);
        ClassWithoutImplCompartorOrComparable raju1 = new ClassWithoutImplCompartorOrComparable("Rajesh", 5.8f, 80);
        ClassWithoutImplCompartorOrComparable[] classWithoutImplCompartorOrComparables = {akshay1,heema1,raju1};
        Comparator<ClassWithoutImplCompartorOrComparable> com = new Comparator<ClassWithoutImplCompartorOrComparable>() {
            @Override
            public int compare(ClassWithoutImplCompartorOrComparable o1, ClassWithoutImplCompartorOrComparable o2) {
                if (o1.getWeight() > o2.getWeight()) {
                    return 1;
                } else if (o1.getWeight() < o2.getWeight()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        Arrays.sort(classWithoutImplCompartorOrComparables,com);
        for(int i=0;i< classWithoutImplCompartorOrComparables.length;i++){
            System.out.println(classWithoutImplCompartorOrComparables[i]);
        }
    }
}
