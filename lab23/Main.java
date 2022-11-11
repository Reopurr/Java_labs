package lab23;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
class Main extends JFrame {
    JPanel up;
    JPanel down;
    JPanel left;
    JPanel right;
    JPanel center;

    Main() {
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new BorderLayout());

        // Creating new Panels
        up     = new JPanel(new FlowLayout());
        down   = new JPanel(new FlowLayout());
        left   = new JPanel(new FlowLayout());
        right  = new JPanel(new FlowLayout());
        center = new JPanel(new FlowLayout());

        // Create JLabels
        JLabel upL = new JLabel("NORTH");
        JLabel downL = new JLabel("SOUTH");
        JLabel leftL = new JLabel("WEST");
        JLabel rightL = new JLabel("EAST");
        JLabel centerL = new JLabel("CENTER");

        // Add them to corresponding panels
        up.add(upL);
        down.add(downL);
        left.add(leftL);
        right.add(rightL);
        center.add(centerL);

        // Add Mouse listeners
        addEnterText(upL, "Добро пожаловать в");
        addEnterText(downL, "Добро пожаловать Абха");
        addEnterText(leftL, "Добро пожаловать в Джидда");
        addEnterText(rightL, "Добро пожаловать в Дахране");
        addEnterText(centerL, "Добро пожаловать в ");

        // Add to main window
        add(up, BorderLayout.NORTH);
        add(down, BorderLayout.SOUTH);
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);
        add(center, BorderLayout.CENTER);

        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    protected void addEnterText(JLabel textL, String text) {
        JFrame mainthis = this;
        textL.addMouseListener(new MouseListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                new InfoWindow(text, mainthis);
            }
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}