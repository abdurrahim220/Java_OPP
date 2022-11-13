package com.JavaBasic;

public class CompareArrays {
    public static void main(String[] args) {
        int [] number1 = {2, 4, 6, 8,10};
       // int [] number2 = number1;
        int [] number2 = {2, 4, 6, 8,10, 10};

        //if(number1.equals(number2))
//        if(number1 == number2)
//        {
//            System.out.println("They are same!!");
//        }
//        else
//        {
//            System.out.println("They are not The same!!");
//        }
        boolean arrayEqual = true;
        int i = 0;

        if(number1.length != number2.length)
        {
            arrayEqual = false;
        }

        while (arrayEqual && i<number1.length)
        {
            //System.out.println();
            if (number1[i] != number2[i])
            {
                arrayEqual = false;
            }
            i++;
        }

        if(arrayEqual)
        {
            System.out.println("they are same!");
        }
        else
        {
            System.out.println("They are not the samw!!");
        }

    }
}
