package com.JavaBasic;

public class Arrays {
    public static void main(String[] args) {
        int [] number = new int[4];
//        int number2 [] = new int[10];
//
//        int [] number3, number4, number5; ///to put all in a array
//
//        int number6 [], number7[], number8[]; ///to put separate in an array
        //index number are in below!!

        number[0] = 5;
        number[1] = 10;
        number[2] = 15;
        number[3] = 20;
//        number[4] = 25;
//        number[5] = 30;
//        number[7] = 35;
//        number[8] = 40;
//        number[9] = 45;
//        number[10] = 50;

        int [] number11 = {10,15,20,25};

        //System.out.println(number11[3]);

        for(int i = 0;i<number.length;i++)
        {
            System.out.println(number[i]);
           // System.out.println(number11[i]);
        }

        System.out.println();

        for (int val : number11)
        {
            System.out.println(val);
        }
    }
}
