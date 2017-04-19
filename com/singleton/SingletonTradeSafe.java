package com.singleton;

/**
 * Created by Pratik Ambani on 18/03/17.
 */
public class SingletonTradeSafe {

    private static SingletonTradeSafe instance;

    private SingletonTradeSafe(){}

    public static synchronized SingletonTradeSafe getInstance(){
        if(instance == null){
            instance = new SingletonTradeSafe();
        }
        return  instance;
    }
}
