import javax.swing.*;
public class JSlider1 extends JFrame{
    JSlider1(){
        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,50,25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }
    public static void main(String[] args) {
        JSlider1 frame = new JSlider1();
        frame.pack();
        frame.setVisible(true);
    }
}
