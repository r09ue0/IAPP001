public abstract class Mammal implements Animal
{
    protected String breed;
    protected String furColour;
    protected boolean fedMilk;
    protected boolean warmBlooded;
    protected String habitat;
    protected int numLegs;
    
    public Mammal(String breed, String furColour, String habitat, int numLegs)
    {
        this.breed = breed;
        this.furColour = furColour;
        this.habitat = habitat;
        this.fedMilk = true;
        this.warmBlooded = true;
        this.numLegs = numLegs;
    }
    
    public String feed()
    {
        return "Yum";
    }
    
    public void displayHabitat()
    {
       System.out.println("I live in the "+ habitat);
    }
    
    @Override
    public abstract String getName();
    
    @Override
    public abstract String makeNoice();
    
    @Override
    public String toString()
    {
        return getName() +" says "+ makeNoice();
    }
}
