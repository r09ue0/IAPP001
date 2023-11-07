public class Bus extends Vehicle
{
    private static final String NAME = "Bus";
    private final double DISTANCE_FACTOR = 100.0;
    private int passengers;
    
    public Bus(String registration, int acceleration, int passengers)
    {
        super(registration, NAME, acceleration);
        this.passengers = passengers;
    }
    
    public double distance(int time)
    {
        return acceleration * (DISTANCE_FACTOR / passengers) * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" with Passengers "+ passengers;
    }
}
