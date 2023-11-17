package FoodOrderingPackage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingPackage extends JFrame{
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JPanel panel1;

    public static void main(String[] args) {
        FoodOrderingPackage app = new FoodOrderingPackage();
        app.setContentPane(app.panel1);
        JButton btn = new JButton("HIEFS");
        app.setSize(400, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Order Food");
        app.setVisible(true);
    }

    JCheckBox[] orders = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
    JRadioButton[] discounts = {rbNone, rb5, rb10, rb15};

public FoodOrderingPackage() {
    rbNone.setSelected(true);
    btnOrder.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            float total = 0;
            if(cPizza.isSelected()){
                total += 100;
            }

            if(cBurger.isSelected()){
                total += 80;
            }

            if(cFries.isSelected()){
                total += 65;
            }

            if(cSoftDrinks.isSelected()){
                total += 55;
            }

            if(cTea.isSelected()){
                total += 50;
            }

            if(cSundae.isSelected()){
                total += 40;
            }

            if(rb5.isSelected()){
                total = (float) (total - (total*.05));
            }

            if(rb10.isSelected()){
                total = (float) (total - (total*.10));
            }

            if(rb15.isSelected()){
                total = (float) (total - (total*.15));
            }

            JOptionPane.showMessageDialog(panel1, "Your total is Php " + String.format("%.2f", total));
        }
    });
}
}
