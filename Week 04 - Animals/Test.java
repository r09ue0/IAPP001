public class Test
{
    private Mammal[] mammals = {
        new Dog("Stupid", "Black", "House", 4, 35),
        new Whale("White", "White", "Ocean", 0)
    };
    
    private Shape[] shapes = {
        new RegularPentagon(10),
        new RegularOctagon(20)
    };
    
    public Test()
    {
        for(Mammal mammal : mammals)
            System.out.println(mammal.toString());
        
        for(Shape shape : shapes)
            System.out.println(shape.toString());
    }
}
