package org.example;

public class SingltonDesignPattern {

    private static SingltonDesignPattern instance;

    private SingltonDesignPattern(){};

    public static synchronized SingltonDesignPattern getInstance(){
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

