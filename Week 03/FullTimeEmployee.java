public class FullTimeEmployee extends Employee
{
    private final double SALARY_RATE = 0.03846153846;
    private double salary;
    
    public FullTimeEmployee(String name, int id, String dob, double salary)
    {
        super(name, id, dob);
        this.salary = salary;
    }

    @Override
    public double calculatePay()
    {
        return salary * SALARY_RATE;
    }
}
