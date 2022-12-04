import java.awt.*;
public class sampleUI2 extends Frame {
    Label user, pass;
    TextField tuser, tpass;
    Button submit;
    sampleUI2(){
        setLayout(null);
        setSize(500,500);
        user = new Label("user name");
        user.setBounds(100, 50, 100, 20);
        add(user);
        tuser = new TextField();
        tuser.setBounds(150, 50, 100, 20);
        add(tuser);
        setVisible(true);
    }
    public static void main(String[] args) {
        new sampleUI2();
    }
}
