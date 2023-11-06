import java.text.DecimalFormat;

public abstract class Employee
{
    protected String name;
    protected int id;
    protected String dob;
    
    private final String pattern = "####,####.##";
    private DecimalFormat numberFormat = new DecimalFormat(pattern);
    
    public Employee(String name, int id, String dob)
    {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }
    
    public void pay()
    {
        System.out.println("Payrun for "+ toString());
        System.out.println("Amount: $"+ numberFormat.format(calculatePay()));
    }
    
    public abstract double calculatePay();
    
    public String toString()
    {
        return "Name: "+ name +" ID: "+ id +" DoB: "+ dob;
    }
}
