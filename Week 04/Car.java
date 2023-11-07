public class Car extends Vehicle
{
    private static final String NAME = "Car";
    private final int DISTANCE_FACTOR = 20;
    private String bodyType;
    
    public Car(String registration, int acceleration, String bodyType)
    {
        super(registration, NAME, acceleration);
        this.bodyType = bodyType;
    }
    
    public double distance(int time)
    {
        return acceleration * DISTANCE_FACTOR * time;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" with Body Type "+ bodyType;
    }
}
