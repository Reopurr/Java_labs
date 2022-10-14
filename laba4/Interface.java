package laba4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Interface extends JFrame {
    private int a=0, b=0;
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    JButton but1 = new JButton("AC Milan");

    JButton but2 = new JButton("Real Madrid");

    JLabel label = new JLabel(a + " X " + b);
    JLabel label2 = new JLabel("Last scorer: N/A");
    JLabel label3 = new JLabel("Winner: DRAW");

    Interface()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(400,400);
        add(but1);
        add(but2);
        add(label);
        add(label2);
        add(label3);
        but1.addActionListener(ActionEvent ->
        {
            a++;
            label.setText(a +" X " + b);
            label2.setText("Last Scorer: Milan");
            if (a>b)
                label3.setText("Winner: Milan");
            else if (b>a)
                label3.setText("Winner: Madrid");
            else if(b == a)
                label3.setText("Winner: DRAW");
        });
        but2.addActionListener(ActionEvent ->
        {
            b++;
            label.setText(a +" X " + b);
            label2.setText("Last Scorer: Madrid");
            if (a>b)
                label3.setText("Winner: Milan");
            else if (b>a)
                label3.setText("Winner: Madrid");
            else if(a == b)
                label3.setText("Winner: DRAW");
        });

    }
    public static void main(String[]args)
    {
        Interface i = new Interface();
        i.setVisible(true);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
