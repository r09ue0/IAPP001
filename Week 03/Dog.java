public class Dog extends Mammal
{
    private double tailLength;
    
    public Dog(String breed, String furColour, String habitat, int numLegs, double tailLength)
    {
        super(breed, furColour, habitat, numLegs);
        this.tailLength = tailLength;
    }
    
    public void wag()
    {
        System.out.println("Dog is wagging its "+ tailLength +" cm tail.");
    }
}
