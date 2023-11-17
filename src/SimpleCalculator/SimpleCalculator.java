package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JPanel panel1;
    private JButton btnCompute;

    public SimpleCalculator() {
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Float.parseFloat(tfNumber1.getText());
                float num2 = Float.parseFloat(tfNumber2.getText());
                char op = 
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.panel1);
        JButton btn = new JButton("HIEFS");
        app.setSize(800, 200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Hello World");
        app.setVisible(true);
    }
}
