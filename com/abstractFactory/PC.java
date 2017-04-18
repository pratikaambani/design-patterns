package com.factory;

/**
 * Created by Pratik Ambani on 18/03/17.
 */
public class PC extends Computer {

    private String ram;
    private String cpu;
    private String hdd;


    public PC(String ram,String hdd, String cpu){
        this.ram = ram;
        this.hdd= hdd;
        this.cpu = cpu;
    }
    public String getRam(){
        return  this.ram;
    }
    public String getCpu(){
        return this.cpu;
    }
    public String getHdd(){return  this.hdd;}




}
