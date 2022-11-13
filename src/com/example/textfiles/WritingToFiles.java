package com.example.textfiles;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {
    public static void main(String[] args) throws IOException
    {
        //Create a file and open the file
        //if the file exits it will replace the file
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        outputFile.println("This is Line 1!!");
        outputFile.println("This is Line 2!!");
        outputFile.println("This is Line 3!!");
        outputFile.println("This is Line 4!!");
        outputFile.println("This is Line 5!!");
        outputFile.println("This is Line 6!!");
        outputFile.println("Mirza is bokachonda!!!");
        outputFile.println("Mirza is bokachonda!!!");
        outputFile.println("Mirza is bokachonda!!!");
        outputFile.println("Mirza is bokachonda!!!");
        outputFile.println("Mirza is bokachonda!!!");


        outputFile.close();
    }
}
