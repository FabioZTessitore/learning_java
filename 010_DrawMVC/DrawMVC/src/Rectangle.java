import java.awt.Color;

public class Rectangle {

    private int xOrig, yOrig, width, height;
    private Color color;

    public Rectangle(int x, int y, int w, int h, Color c) {
        setOrigin(x ,y);
        setWidth(w);
        setHeight(h);
        setColor(c);
    }

    public void setOrigin(int x, int y) {
        xOrig = x > 0 ? x : 0;
        yOrig = y > 0 ? y : 0;
    }

    public void setWidth(int w) {
        width = w > 0 ? w : 0;
    }

    public void setHeight(int h) {
        height = h > 0 ? h : 0;
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public int getXOrigin() {
        return xOrig;
    }

    public int getYOrigin() {
        return yOrig;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
}
