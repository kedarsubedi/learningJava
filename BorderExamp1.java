import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
public class BorderExamp1 {
    JFrame f;
    BorderExamp1(){
        f = new JFrame("Border to JPanel");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setSize(500,500);
        createUI(f);
        f.setLayout(null);

    }
    public void createUI(JFrame f){
        JPanel p = new JPanel();
        Border blackLine = BorderFactory.createLineBorder(Color.GREEN);
        p.setBounds(50,100,300,100);
        p.add(new JLabel("Hello Java"));
        p.setBorder(blackLine);
        f.add(p);
    }

    public static void main(String[] args) {
        new BorderExamp1();
    }
}
