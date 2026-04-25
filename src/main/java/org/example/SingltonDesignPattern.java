package org.example;

public class SingltonDesignPattern {

    private static volatile SingltonDesignPattern instance;

    private SingltonDesignPattern(){};

    public static SingltonDesignPattern getInstance(){
        if(instance == null){
            synchronized (SingltonDesignPattern.class){
                if(instance == null){
                    instance = new SingltonDesignPattern();
                }
           }
        }
        return instance;
   }
}

