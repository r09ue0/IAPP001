public class Triangle implements Shape  
{
    final public int SIDES = 3;
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double height;

    public Triangle(double a, double b, double c, double h)
    {
        sideA = a;
        sideB = b;
        sideC = c;
        height = h;
    }

    public double area()
    {
        return 0.5*(sideB* height);
    }

    public double perimeter()
    {
        return sideA + sideB + sideC;
    }
}
