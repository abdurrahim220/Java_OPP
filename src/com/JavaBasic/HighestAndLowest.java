package com.JavaBasic;

public class HighestAndLowest {
    public static void main(String[] args) {
        int [] number = {2,4,6,8,10,12,15,17,1,20};

        int highest = number[0];

        for(int i=1;i<number.length;i++)
        {
            if(number[i]>highest)
            {
                highest=number[i];
            }
        }
        System.out.println("the highest value is : "+highest);

        System.out.println();

        int lowest = number[0];

        for(int i=1; i<number.length;i++)
        {
            if(number[i]<lowest)
            {
                lowest = number[i];
            }
        }
        System.out.println("The lowest number is : "+lowest);
    }
}
