import java.awt.*;

public class frame1 extends Frame{
    TextField tuser, tpass;
    Label user, pass;
    Button b1;
    frame1(){
        setTitle("Home");
        user = new Label("User Name");
        user.setBounds(20,100,100,20);
        add(user);
        tuser = new TextField();
        tuser.setBounds(120,100,100,20);
        add(tuser);

        pass = new Label("Password");
        pass.setBounds(20, 120, 100, 20);
        add(pass);
        tpass = new TextField();
        tpass.setBounds(120, 120, 100, 20);
        add(tpass);
        
        b1 = new Button("Submit");
        b1.setBounds(120, 150, 150, 20);
        add(b1);

        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new frame1();
    }
}
