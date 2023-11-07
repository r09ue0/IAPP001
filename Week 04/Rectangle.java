public class Rectangle implements Shape  
{
    protected double length;
    protected double width;

    public Rectangle(double length, double width)
    {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double area()
    {
        return length*width;
    }

    public double perimeter()
    {
        return 2*(length + width);
    }
}
