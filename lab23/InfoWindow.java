package lab23;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InfoWindow extends JDialog {
    JLabel text;
    JButton accept;
    ActionListener closeListener;
    JFrame parent;

    InfoWindow() {
        this("");
    }

    InfoWindow(String message) {
        setLayout(new GridLayout(2, 1));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Text label
        text = new JLabel(message);
        JPanel text_layout = new JPanel();
        text_layout.setLayout(new FlowLayout());
        text_layout.add(text);
        text_layout.setMinimumSize(new Dimension(100, 20));

        // Ok button
        accept = new JButton("OK");
        JPanel accept_layout = new JPanel();
        accept_layout.setLayout(new FlowLayout());
        accept_layout.add(accept);
        text_layout.setMinimumSize(new Dimension(40, 20));
        accept.addActionListener(e -> dispose());

        add(text_layout);
        add(accept_layout);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    InfoWindow(String message, JFrame p) {
        this(message);
        parent = p;
        parent.setEnabled(false);
        setVisible(true);
    }

    public static void send_alert(String text) {
        InfoWindow iw = new InfoWindow(text);
        iw.setVisible(true);
    }

    public void setCloseNotify(ActionListener a) {
        closeListener = a;
    }


    @Override
    public void dispose() {
        if (closeListener != null) {
            closeListener.actionPerformed(new ActionEvent(this, 0, "Closed"));
        }
        if (parent != null) {
            parent.setEnabled(true);
        }
        super.dispose();
    }
}
