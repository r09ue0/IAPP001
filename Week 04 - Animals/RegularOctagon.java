public class RegularOctagon extends RegularShape
{
    private static final int NUM_OF_SIDES = 8;
    public RegularOctagon(double sideLength)
    {
        super(sideLength, NUM_OF_SIDES);
    }

    @Override
    public double area(){
        return  2.0 *(1.0 + Math.sqrt(2)) * Math.pow(sideLength, 2);
    }
    
    @Override
    public String toString()
    {
        return "Regular Octagon has "+ super.toString() +" and the area is "+ area();
    }
}
