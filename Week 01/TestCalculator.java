public class TestCalculator
{
    private Calculator calc = new Calculator(4.0, 3.0);
    
    public TestCalculator()
    {
        System.out.println("Add "+ calc.add());
        System.out.println("Subtract "+ calc.subtract());
        System.out.println("Multiply "+ calc.multiply());
        System.out.println("Divide "+ calc.divide());
    }
}
