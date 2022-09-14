import javax.swing.*;
import java.awt.event.MouseListener;
import java.util.Random;

public class Main {

    public static JButton skokan = new JButton();
    public static JFrame fr = new JFrame("Rybník");

    public static void main(String[] args) {

        fr.setVisible(true);
        fr.setBounds(200,200,800,500);
        fr.setLayout(null);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        skokan.setBounds(400, 250, 50, 50);
        skokan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Random x = new Random();
                int xx = x.nextInt(750);
                int yy = x.nextInt(450);
                skokan.setBounds(xx, yy, 50, 50);
                skokan.setVisible(true);
                fr.add(skokan);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
            }
        });
        skokan.setVisible(true);
        fr.add(skokan);
    }
}