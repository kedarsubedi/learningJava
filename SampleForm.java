import javax.swing.*;

public class SampleForm {
    SampleForm(){
        JFrame jf = new JFrame("Registration Form");
        //create labels
        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(50,50,100,30);
        jf.add(firstName);
        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(50,100,100,30);
        jf.add(lastName);
        JLabel emailId = new JLabel("Email");
        emailId.setBounds(50,150,100,30);
        jf.add(emailId);
        JLabel password = new JLabel("Password");
        password.setBounds(50,200,100,30);
        jf.add(password);
        JLabel gender = new JLabel("Gender");
        gender.setBounds(50,250,100,30);
        jf.add(gender);
        JLabel country = new JLabel("Country");
        country.setBounds(50,300,100,30);
        jf.add(country);

        //create text fields
        JTextField tfirstName = new JTextField();
        tfirstName.setBounds(150,50,200,30);
        jf.add(tfirstName);
        JTextField tlastName = new JTextField();
        tlastName.setBounds(150,100,200,30);
        jf.add(tlastName);
        JTextField temail = new JTextField();
        temail.setBounds(150,150,200,30);
        jf.add(temail);
        JPasswordField tpassword = new JPasswordField();
        tpassword.setBounds(150,200,200,30);
        jf.add(tpassword);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150,250,100,30);
        jf.add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(250,250,150,30);
        jf.add(female);
        String countries[] = {"Nepal", "China", "America", "Canada"};
        JComboBox cbx = new JComboBox<>(countries);
        cbx.setBounds(150,300,200,30);
        jf.add(cbx);
        

        //agree button
        JRadioButton agreed = new JRadioButton("I agree to the terms and conditions");
        agreed.setBounds(50, 350, 300, 30);
        jf.add(agreed);

        //submit button
        JButton submit = new JButton("Submit");
        submit.setBounds(250,400,100,30);
        jf.add(submit);

        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new SampleForm();
    }
}
