package org.example;

public class Main {
    public static void main(String[] args) {

        SingltonDesignPattern ob1 = SingltonDesignPattern.getInstance();
        SingltonDesignPattern ob2 = SingltonDesignPattern.getInstance();

        System.out.println(ob1);
        System.out.println(ob2);

        if(ob1 == ob2){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }
    }
}