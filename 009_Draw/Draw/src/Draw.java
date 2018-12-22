import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Draw extends JFrame {

    public Draw()
    {
        super("Drawing");

        setSize(250, 100);
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        g.setColor(new Color(255, 0, 0));
        g.fillRect(25, 45, 100, 20);

        g.setColor(new Color(0, 0, 0));
        g.drawString("Fill Rect Draw a Rectangle", 25, 80);
    }

    public static void main(String args[])
    {
        Draw app = new Draw();

        app.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
