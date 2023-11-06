public class TestEmployee
{
    private FullTimeEmployee mike = new FullTimeEmployee("Mike", 1, "01/10/1985", 60000);
    private PartTimeEmployee sally = new PartTimeEmployee("Sally", 2, "16/12/1999", 22.50);

    public TestEmployee()
    {
        mike.pay();
        sally.setHoursWorked(14);
        sally.pay();
    }
}
