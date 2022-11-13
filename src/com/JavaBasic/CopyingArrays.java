package com.JavaBasic;

public class CopyingArrays {
    public static void main(String[] args) {
        int [] array1 = {2, 4,6, 8, 10}; //size 5

//        array1[1] = 5;
//
//        int [] array2 = array1;
//        printArray(array1);
//        System.out.println();
//        printArray(array2);

        int [] array2 = new int[array1.length];

        for(int i =0; i<array1.length;i++)
        {
            array2[i] = array1[i];
        }

        array1[1] = 5;

        printArray(array1);
        System.out.println();
        printArray(array2);
    }
    public static void printArray(int [] array)
    {
        for(int vale : array) // hunts for loop
        {
            System.out.println(vale);
        }
    }
}
