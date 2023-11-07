public abstract class Vehicle
{
    protected String registration;
    protected String name;
    protected int acceleration;

    public Vehicle(String registration, String name, int acceleration)
    {
        this.registration = registration;
        this.name = name;
        this.acceleration = acceleration;
    }

    public abstract double distance(int time);
    
    public void display(int time)
    {
        System.out.println("After "+ time +" seconds the "+ toString() +" is "+ distance(time) +" metres from the starting line.");
    }
    
    public String toString()
    {
        return name +" with registration "+ registration;
    }
}
