import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH = 500;
    private final int PANEL_HEIGHT = 500;
    private Image enemy;
    private Image backgroundImage;
    Timer timer;
    private int xVelocity = 2;
    private int yVelocity = 1;
    private int x = 0;
    private int y = 0;
    private int ENEMY_WIDTH;
    private int ENEMY_HEIGHT;
    private Graphics2D g2d;
    public MyPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        enemy = new ImageIcon("enemy.png").getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
        backgroundImage = new ImageIcon("sp.png").getImage();
        timer = new Timer(5, this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        g2d = (Graphics2D)g;
        g2d.drawImage(backgroundImage, 0, 0,500, 500,  null);
        g2d.drawImage(enemy, x, y, 150, 100, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0){
            xVelocity *= -1;
        }
        if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0){
            yVelocity *= -1;
        }
        y += yVelocity;
        x += xVelocity;
        repaint();
    }
}
