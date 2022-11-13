package com.JavaBasic;

public class StringArray {
    public static void main(String[] args) {
        String [] name = getName();

        int i;
        
        for(i = 0;i<name.length;i++);
        {

            System.out.println(name[i]);
        }
    }

    public static String [] getName()
    {
        String [] name = new String[6];
        
        name[0]="John";
        name[1]="Peter";
        name[2]="Paul";
        name[3]="Simon";
        name[4]="Chuck";
        name[5]=null;
        name[6]=null;

        return  name;
        
    }
}


