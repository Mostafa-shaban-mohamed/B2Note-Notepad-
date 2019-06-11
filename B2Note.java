
package b2note;

import javax.swing.JFrame;

public class B2Note {

    public static void main(String[] args) {
        TextEidtorGUI obj = new TextEidtorGUI();
        obj.setBounds(0, 0, 700, 700);
        obj.setTitle("B2Notepad");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
