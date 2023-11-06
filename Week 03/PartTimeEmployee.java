public class PartTimeEmployee extends Employee
{
    
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee(String name, int id, String dob, double hourlyRate)
    {
        super(name, id, dob);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay()
    {
        return hoursWorked * hourlyRate;
    }
    
    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
}
