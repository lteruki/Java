package Lab8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Domik {
	public static void main(String[] args) {
        JFrame frame=new JFrame("Test");
        frame.setBounds(0, 0,500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPane = new JPanel(){
            Graphics2D g2;

            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g2=(Graphics2D)g;
                g2.setColor(Color.BLUE);
                g2.drawLine(150, 300, 330, 300);
                g2.drawLine(150, 300, 150, 200);
                g2.drawLine(330, 300, 330, 200);
                g2.drawLine(120, 200, 360, 200);
                g2.drawLine(240, 100, 360, 200);
                g2.drawLine(240, 100, 120, 200);
            }
        };
        frame.setContentPane(contentPane);
    }
}
