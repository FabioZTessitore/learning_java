import java.awt.Graphics;
import java.awt.Color;

public class RectangleView {

    private Rectangle model;
    private Color textColor;

    public RectangleView(Rectangle r)
    {
        setModel(r);
        textColor = new Color(0, 0, 0);
    }

    public void setModel(Rectangle r)
    {
        model = r;
    }

    public void paint(Graphics g)
    {
        g.setColor(model.getColor());
        g.fillRect(model.getXOrigin(), model.getYOrigin(), model.getWidth(), model.getHeight());

        g.setColor(textColor);
        g.drawString("Rectangle", model.getXOrigin()+5, model.getYOrigin()+model.getHeight()/2);
    }
}
