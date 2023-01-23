import javax.swing.*;

public class MyFrame extends JFrame{
    MyPanel panel;
    public MyFrame(){
        panel = new MyPanel();
        this.add(panel);
        this.pack();
        this.setTitle("Flying Tommy");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("enemy.png");
        this.setIconImage(image.getImage());

    }
}
