package com.JavaBasic;

import javax.swing.*;

public class TheSwitchStatement2 {
    public static void main(String[] args) {
        int number ;
        String input = JOptionPane.showInputDialog("Please enter 1, 2 or 3!!");

        number = Integer.parseInt(input);

        switch (number)
        {
            case 1:
                JOptionPane.showMessageDialog(null,"You entered 1!!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"You entered 2!!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"you entered 3!!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You did not enter a 1, 2 or 3!!");
        }

        char letter;
        input =JOptionPane.showInputDialog("Please enter a, b or c!!");

        letter = input.charAt(0);

        switch (letter)
        {
            case 'A':
            case 'a':
                JOptionPane.showMessageDialog(null,"You entered a!!");
                break;
            case 'B':
            case 'b':
                JOptionPane.showMessageDialog(null,"You entered b!!");
                break;
            case 'C':
            case 'c':
                JOptionPane.showMessageDialog(null,"You entered c!!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You did not entered a correct value!!");
        }

        System.exit(0);

    }
}
