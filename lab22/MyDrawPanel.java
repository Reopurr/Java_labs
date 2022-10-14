package lab22;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MyDrawPanel extends JPanel {
    public void paintComponent (Graphics g) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        Image image = new ImageIcon(a).getImage();
        g.drawImage(image, 0, 0, this);
    }
}