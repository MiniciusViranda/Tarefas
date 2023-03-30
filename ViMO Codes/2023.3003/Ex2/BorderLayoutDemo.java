package Ex2;

import javax.swing.JFrame;

public class BorderLayoutDemo {

    public static void main(String[] args) {
        
        BorderLayoutFrame borderLayoutFrame = new BorderLayoutFrame();
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setSize(300,200);
        borderLayoutFrame.setResizable(false);
        borderLayoutFrame.setLocationRelativeTo(null);
        borderLayoutFrame.setVisible(true);
    }
}
