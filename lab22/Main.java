package lab22;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();
        frame.getContentPane().add(panel);
        frame.setSize(657, 465);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
