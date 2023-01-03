import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ActionListener1 implements ActionListener{
    JFrame f;
    JButton b1,b2;
    ActionListener1(){
        f = new JFrame("Action Listener");
        f.setSize(500,500);
        f.setLayout(null);
        b1 = new JButton("button1");
        b1.setBounds(100,100,100,30);
        f.add(b1);
        b1.addActionListener(this);
        b2 = new JButton("button2");
        b2.setBounds(100,200,100,30);
        f.add(b2);
        b2.addActionListener(this);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            JOptionPane.showMessageDialog(null,"Button1 is clicked");
        }
        else if(e.getSource() == b2){
            JOptionPane.showMessageDialog(null,"Button2 is clicked");
        }
}
    public static void main(String[] args) {
        new ActionListener1();
    }
}
