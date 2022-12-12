import javax.swing.*;
public class SampleFrame {
    JFrame main;
    JRadioButton male, female;
    ButtonGroup g;
    JCheckBox terms;

    SampleFrame(){
        main = new JFrame("Main");
        main.setSize(500,500);
        // main.setLayeredPane(null);

        // String c[] = {"Nepal, China"};
        // country = new JComboBox<>(c);
        // country.setBounds(100, 50, 60, 30);

        male = new JRadioButton("male");
        male.setBounds(100, 50, 70,30);
        main.add(male);

        female = new JRadioButton("female");
        female.setBounds(170, 50, 70, 30);
        main.add(female);

        g = new ButtonGroup();
        g.add(female);
        g.add(male);

        terms = new JCheckBox();
        terms.setBounds(200,250,100,30);
        main.add(terms);

        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }
    public static void main(String[] args) {
        SampleFrame s = new SampleFrame();

    }
    
}
