import java.awt.*;
public class frame2 {
    Button b1;
    frame2(){
        Frame f1 = new Frame("Home");
        b1 = new Button("Submit");
        b1.setBounds(10,10,20,20);
        f1.add(b1);
        f1.setSize(500, 500);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new frame2();
    }
}
