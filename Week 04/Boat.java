public class Boat extends Vehicle
{
    private static final String NAME = "Boat";
    private int horsePower;
    
    public Boat(String registration, int acceleration, int horsePower)
    {
        super(registration, NAME, acceleration);
        this.horsePower = horsePower;
    }
    
    public double distance(int time)
    {
        return acceleration * horsePower * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" with Horse Power "+ horsePower;
    }
}
