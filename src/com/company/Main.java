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

        //adding planet 1 feature
        planet1 astranout =new planet1();
        astranout.color="grey";
        astranout.relationshipStatus="single";
        astranout.size="9989898989km";

    }
}
