import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RadioButtion1 implements ActionListener {
    public int selectedGender = -1;
    JRadioButton male,female;
    RadioButtion1(){
        JFrame mainFrame = new JFrame("Radion Button Action Listener");
        mainFrame.setSize(500,500);
        mainFrame.setLayout(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
        
        male = new JRadioButton("Male");
        female = new JRadioButton("female");
        male.setBounds(100,100,100,30);
        female.setBounds(200,100,100,30);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);
        mainFrame.add(female);
        mainFrame.add(male);
        male.addActionListener(this);
        female.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == male){
            this.selectedGender = 0;
            JOptionPane.showMessageDialog(null,"Male Selected");
        } else if(e.getSource() == female){
            this.selectedGender = 1;
            JOptionPane.showMessageDialog(null,"Female Selected");
        }else {
            System.out.println("Invalid Action Button");
        }
    }
    public static void main(String[] args) {
        new RadioButtion1();
    }
}
