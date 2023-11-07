public class Bike extends Vehicle
{
    private static final String NAME = "Bike";
    private final int DISTANCE_FACTOR = 100;
    private int capacity;
    
    public Bike(String registration, int acceleration, int capacity)
    {
        super(registration, NAME, acceleration);
        this.capacity = capacity;
    }
    
    public double distance(int time)
    {
        return acceleration * (capacity / DISTANCE_FACTOR) * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" with Capacity "+ capacity;
    }
}
