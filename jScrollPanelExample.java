import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class jScrollPanelExample {
    JFrame f;
    JTextArea area;
    JScrollPane pane;
    jScrollPanelExample(){
        f = new JFrame("scroll Pane");
        f.setSize(400,400);
        // f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        
        area = new JTextArea(20,20);
        pane = new JScrollPane(area);
        f.add(pane);

        f.setVisible(true);

    }

    public static void main(String[] args) {
        new jScrollPanelExample();
    }
}
