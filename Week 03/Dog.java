public class Dog extends Mammal
{
    private static final int NUM_LEGS = 4;
    private double tailLength;
    
    public Dog(String breed, String furColour, String habitat, double tailLength)
    {
        super(breed, furColour, habitat, NUM_LEGS);
        this.tailLength = tailLength;
    }
    
    public void wag()
    {
        System.out.println("Wag Wag...");
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" Tail Length: "+ tailLength;
    }
}
