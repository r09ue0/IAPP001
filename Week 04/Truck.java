public class Truck extends Vehicle
{
    private static final String NAME = "Truck";
    private final int DISTANCE_FACTOR = 100;
    private int tonnage;
    
    public Truck(String registration, int acceleration, int tonnage)
    {
        super(registration, NAME, acceleration);
        this.tonnage = tonnage;
    }
    
    public double distance(int time)
    {
        return acceleration * tonnage / DISTANCE_FACTOR * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" with Tonnage "+ tonnage;
    }
}
