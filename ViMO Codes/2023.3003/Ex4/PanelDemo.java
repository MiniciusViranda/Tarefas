package Ex4;

import javax.swing.JFrame;

public class PanelDemo extends JFrame{
    
    public static void main(String[] args) {
        
        PanelFrame panelFrame = new PanelFrame();
        panelFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelFrame.setSize(450,200);
        panelFrame.setResizable(false);
        panelFrame.setLocationRelativeTo(null);
        panelFrame.setVisible(true);
    }
}
