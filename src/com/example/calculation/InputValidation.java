package com.example.calculation;

import javax.swing.*;
import java.awt.*;

public class InputValidation {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter a number in the range of 1 through 100!!");

        int number = Integer.parseInt(input);

        while(number < 1 || number > 100)
        {
            JOptionPane.showMessageDialog(null,"the number is not valid");
            input = JOptionPane.showInputDialog("Please enter a number in the range of 1 through 100!!");
            number = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null,"Correct!!");

        System.exit(0);
    }
}
