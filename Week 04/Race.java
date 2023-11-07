public class Race
{
    private Vehicle[] vehicles = new Vehicle[5];

    public Race()
    {
        vehicles[0] =  new Truck("ZXS443", 2, 500);
        vehicles[1] = new Car("ABC123", 4, "Coupe");
        vehicles[2] = new Bike("HGD455", 10, 1000);
        vehicles[3] = new Bus("BD-1234", 3, 75);
        vehicles[4] = new Boat("La2yDa3", 1, 40);
        
        displayAll(10);
    }
    
    public void displayAll(int time)
    {
        for(Vehicle vehicle : vehicles)
        {
            vehicle.display(time);
        }
    }
}
