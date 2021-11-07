package com.company;

public class Main {

    public static void main(String[] args) {

        SolarSystem andromeda = new SolarSystem();
        andromeda.Sun=1;
        andromeda.planet=2;
        andromeda.moon=4;

        featureSun mikeSun=new featureSun();
        mikeSun.color="Red";
        mikeSun.heat="111111888888";
        mikeSun.temp="66001565545652kelvin";
        mikeSun.radius="90000km";
        mikeSun.maritalStatus="in love with asghar";

        //planet2 features
        Planet2 bastranout = new Planet2();
        bastranout.color ="pink";
        bastranout.size="34343433km";
        bastranout.status = "same as Mike's";
        
    }
}
