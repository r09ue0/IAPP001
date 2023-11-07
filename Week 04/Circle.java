public class Circle implements Shape  
{
    public double PI = Math.PI;
    protected double radius;

    public Circle(double Radius)
    {
        radius = Radius;
    }

    public double area()
    {
        return PI * Math.pow(radius, 2);
    }

    public double perimeter()
    {
        return 2 * PI * radius;
    }

    public double diameter()
    {
        return 2 * radius;
    }
}
