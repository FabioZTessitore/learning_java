import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Draw extends JFrame {

    private Rectangle model;
    private RectangleView rectView;

    public Draw()
    {
        super("Drawing (MVC)");

        model = new Rectangle(25, 50, 100, 50, new Color(255, 0, 0));
        rectView = new RectangleView(model);

        setSize(200, 120);
        setVisible(true);
    }

    public void paint(Graphics g) {
        rectView.paint(g);
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
