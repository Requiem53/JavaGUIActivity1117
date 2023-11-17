package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame {

    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
public LeapYear() {
    btnCheckYear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int year = Integer.parseInt(tfYear.getText());

            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        JOptionPane.showMessageDialog(panel1, "Leap year");
                    }else{
                        JOptionPane.showMessageDialog(panel1, "Not a leap year");
                    }
                }else{
                    JOptionPane.showMessageDialog(panel1, "Leap year");
                }
            }else{
                JOptionPane.showMessageDialog(panel1, "Not a leap year");
            }

        }
    });
}
    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.panel1);
        JButton btn = new JButton("HIEFS");
        app.setSize(400, 400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Hello World");
        app.setVisible(true);
    }
}
