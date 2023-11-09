public abstract class RegularShape implements Shape
{
    protected double sideLength;
    protected int numberOfSides;
    
    public RegularShape(double sideLength, int numberOfSides)
    {
        this.sideLength = sideLength;
        this.numberOfSides = numberOfSides;
    }
    
    @Override
    public double perimeter()
    {
        return numberOfSides * sideLength;
    }
    
    @Override
    public abstract double area();
    
    @Override
    public String toString()
    {
        return numberOfSides +" sides and each side is "+ sideLength +" and the perimeter is "+ perimeter();
    }
}
