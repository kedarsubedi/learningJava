import java.awt.*;
public class sampleUI extends Frame {
    Button b1 = new Button("Button 1");
    TextField t1;
    sampleUI(){
        // b1.setSize(20,15);
        setSize(500,500);
        setLayout(null);
        b1.setBounds(50,10,20,15);
        add(b1);
        setVisible(true);
        // setDefaultOnClose(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new sampleUI();
    }
}
