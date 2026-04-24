import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is for optional GUI purposes if we end up having time :)
 */
public class GUI implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JTextField textBox;
    private JLabel label;


    public GUI() {
        frame = new JFrame("Chess");
        frame.setSize(800,850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textBox = new JTextField();
        textBox.setSize(100,50);
        frame.add(textBox,BorderLayout.SOUTH);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        //textBox.addActionListener(new ActionListener()
        ImageIcon path1 = new ImageIcon("rook.png");
        JLabel img1l = new JLabel(new ImageIcon(path1.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH)));
        panel.add(img1l);


        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
