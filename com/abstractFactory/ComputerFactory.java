package com.factory;

/**
 * Created by Pratik Ambani on 21/03/17.
 */
public class ComputerFactory {

    public static Computer getComputer(AbstractFactory fact){
        return fact.createComputer();
    }
}
