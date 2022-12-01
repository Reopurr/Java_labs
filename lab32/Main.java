package lab32;
import lab32.Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Main {
    public static void main(String[] args) {
        lab32.Interface i = new lab32.Interface();
        i.setVisible(true);
        i.setLocation(500, 250);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
