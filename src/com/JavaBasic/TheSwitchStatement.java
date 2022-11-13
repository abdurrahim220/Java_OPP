package com.JavaBasic;

import javax.swing.*;

public class TheSwitchStatement {
    public static void main(String[] args) {
        int number;
        String input = JOptionPane.showInputDialog("Please enter 1, 2 or 3: ");

        number = Integer.parseInt(input);

        if(number == 1)
        {
            JOptionPane.showMessageDialog(null,"You entered 1");
        }
        else if(number == 2)
        {
            JOptionPane.showMessageDialog(null,"You entered 2");
        }
        else if(number == 3)
        {
            JOptionPane.showMessageDialog(null,"You entered 3");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You did not entered 1, 2 or 3!!");
        }

        System.exit(0);
    }
}
