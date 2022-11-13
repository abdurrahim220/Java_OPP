package com.example.method;

public class Methods {
    public static void main(String[] args) {
        //A void method is one that simply performs a task and then terminates
        //System.out.println("This is a void method!!");

        // A value-returning method not only performs a task ,
        // But also sends a value back to the code that called it

        //int number = Integer.parseInt("7000");

//        printAverage(20,30);
//
//        double average = getAverage(10,20);
//
//        System.out.println("Average : "+average);

//        String fullName = fullName("Md.Abdur","Rahim");
//
//        System.out.println(fullName);

        int value = -20;
        if(isValid(value))
        {
            System.out.println("The value is in the range!!");
        }
        else
        {
            System.out.println("The value is not in the range!!");
        }
    }
    /*

     */

    /**
     * This method prints the average of two numbers!!
     * @param val1 The first value
     * @param val2 The second value
     */

    public static void printAverage(int val1, int val2)
    {
        double average = (val1 + val2) / 2.0;

        System.out.println("Average : " + average);
    }

    /**
     * This method calculate the average and return it!!
     * @param val1 the first value
     * @param val2 the second value
     * @return the average of two values!!
     */

    public static double getAverage(int val1,int val2)
    {
        //double average = (val1+val2)/2.0;
        return (val1+val2)/2.0;
        //return average;
    }

    public static String fullName(String name,String surname)
    {
       // String fullName = name + " " + surname;
        return name + " " + surname;

       // return fullName;
    }
    //range between 1 and 100
    public static boolean isValid(int number)
    {
        return (number>=1 && number<=100);
        //boolean status;

//        if(number>=1 && number<=100)
//        {
//            status = true;
//        }
//        else
//        {
//            status = false;
//        }
//        return status;

    }
}
