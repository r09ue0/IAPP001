public class Test
{
    private Dog dogs[] = new Dog[3];
    private Whale whales[] = new Whale[3];

    public Test()
    {
        setupDogs();
        setupWhales();
        displayAll();
    }

    private void displayAll()
    {
        System.out.println("Dogs Details");      
        displayDogs();
        System.out.println("\nWhales Details");      
        displayWhales();
    }

    private void displayDogs()
    {
        for(Dog dog : dogs)
        {
            System.out.println(dog.toString());
        }
    }

    private void displayWhales()
    {
        for(Whale whale : whales)
        {
            System.out.println(whale.toString());
        }
    }

    private void setupDogs()
    {
        dogs[0] = new Dog("Stupid", "White", "House", 35);
        dogs[1] = new Dog("God", "Black", "Paradise", 999);
        dogs[2] = new Dog("Devil", "Gold", "Hell", 999);
    }

    private void setupWhales()
    {
        whales[0] = new Whale("Blue", "Blue", "Pacific Ocean");
        whales[1] = new Whale("White", "White", "Pacific Ocean");
        whales[2] = new Whale("Sea", "Grey", "Indian Ocean");
    }
}
