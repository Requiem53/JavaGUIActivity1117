package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JTextField lblResult;
    private JPanel panel1;
    private JButton btnCompute;

    public SimpleCalculator() {
        lblResult.setEditable(false);
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    float num1 = Float.parseFloat(tfNumber1.getText());
                    float num2 = Float.parseFloat(tfNumber2.getText());
                    int op = cbOperations.getSelectedIndex();
                    float res;
                    if(op == 0){
                        res = num1 + num2;
                    }else if(op == 1){
                        res = num1 - num2;
                    }else if(op == 2){
                        res = num1 * num2;
                    }else{
                        if(num2 == 0){
                            throw new IllegalArgumentException("Denominator be non-zero");
                        }
                        res = num1 / num2;
                    }
                    lblResult.setText(String.format("%.2f", res));
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(panel1, ex.getMessage());
                }
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
