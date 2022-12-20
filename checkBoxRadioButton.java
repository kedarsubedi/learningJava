import javax.swing.*;

public class checkBoxRadioButton {

    JFrame f;
    JMenuBar mb;
    JMenu main;
    JCheckBoxMenuItem i1,i2;
    JRadioButtonMenuItem i3, i4;
    ButtonGroup bg;

    checkBoxRadioButton(){
        f = new JFrame("checkBox and RadioButton menu Items");
        f.setSize(500, 500);
        f.setLayout(null);
        mb = new JMenuBar();

        main = new JMenu("list");
        mb.add(main);

        i1 = new JCheckBoxMenuItem("A");
        i2 = new JCheckBoxMenuItem("B");
        i3 = new JRadioButtonMenuItem("C");
        i4 = new JRadioButtonMenuItem("D");
        bg = new ButtonGroup();
        bg.add(i3);bg.add(i4);

        main.add(i1);main.add(i2);main.add(i3);main.add(i4);
        f.setJMenuBar(mb);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }



    public static void main(String[] args) {
        new checkBoxRadioButton();
    }
}
