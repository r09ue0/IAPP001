public class Rabbit extends Mammal
{
    private static final int NUM_LEGS = 4;
    private double earLength;
    
    public Rabbit(String breed, String furColour, String habitat, double earLength)
    {
        super(breed, furColour, habitat, NUM_LEGS);
        this.earLength = earLength;
    }
    
    @Override
    public String feed()
    {
        return "carrot";
    }
    
    @Override
    public String toString()
    {
        return "Breed: "+ breed +" Fur Colour: "+ furColour +" Ear Length: "+ earLength;
    }
}
