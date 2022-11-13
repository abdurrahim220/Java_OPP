package com.JavaBasic;

import java.util.ArrayList;

public class TheArryList {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList();

        names.add("James");
        names.add("Peter");
        names.add("John");
        names.add("Rahim");
        names.add("Jake");
        names.add("Royal");

        //names.add(3,"Royal");//Replace

        //names.set(1,"Rifat"); // Change the value

        //names.remove(0); // Remove the full value

        for(int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }


    }
}
