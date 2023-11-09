public class RegularPentagon extends RegularShape
{
    private static final int NUM_OF_SIDES = 5;
    public RegularPentagon(double sideLength)
    {
        super(sideLength, NUM_OF_SIDES);
    }

    @Override
    public double area(){
        return  0.25 * Math.sqrt(5*(5+2 * Math.sqrt(5))) * Math.pow(sideLength, 2);
    }
    
    @Override
    public String toString()
    {
        return "Regular Octagon has "+ super.toString() +" and the area is "+ area();
    }
}
