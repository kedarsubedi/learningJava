import java.awt.*;
import javax.swing.*;
import java.io.*;

public class FormDesign {
  public static void main(String[] args) {
    // Create a new JFrame
    JFrame frame = new JFrame("Form Design");

    // Set the size of the frame
    frame.setSize(400, 300);

    // Create a JPanel
    JPanel panel = new JPanel();

    // Set the panel layout to GridLayout
    panel.setLayout(new GridLayout(4, 2));

    // Add some labels to the panel
    panel.add(new JLabel("Name:"));
    JTextField nameField = new JTextField();
    panel.add(nameField);
    panel.add(new JLabel("Email:"));
    JTextField emailField = new JTextField();
    panel.add(emailField);
    panel.add(new JLabel("Phone:"));
    JTextField phoneField = new JTextField();
    panel.add(phoneField);

    // Create a submit button and add it to the panel
    JButton submitButton = new JButton("Submit");
    panel.add(submitButton);

    // Add the panel to the frame
    frame.add(panel);

    // Show the frame
    frame.setVisible(true);

    // Add an action listener to the submit button
    submitButton.addActionListener(e -> {
      // Get the values from the form fields
      String name = nameField.getText();
      String email = emailField.getText();
      String phone = phoneField.getText();

      // Write the values to a file
      try {
        FileWriter fw = new FileWriter("form_values.txt");
        fw.write("Name: " + name + "\n");
        fw.write("Email: " + email + "\n");
        fw.write("Phone: " + phone + "\n");
        fw.close();
        JOptionPane.showMessageDialog(null, "Form values saved to file!");
      } catch (IOException ex) {
        ex.printStackTrace();
      }
    });
  }
}
