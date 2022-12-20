import javax.swing.*;
import java.awt.event.*;

public class popupMenu {

    JFrame f;
    JPopupMenu popup;
    JMenuItem copy,cut,paste,delete;

    popupMenu(){
        f = new JFrame("Pop up menu");
        f.setSize(500,500);
        f.setLayout(null);
        
        popup = new JPopupMenu("EDIT");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        delete = new JMenuItem("Delete");
        popup.add(copy);popup.add(cut);popup.add(paste);popup.add(delete);
        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                popup.show(f, e.getX(), e.getY());
            }
        });
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new popupMenu();
    }
}
