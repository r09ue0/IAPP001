public class Whale extends Mammal
{
    private static final int NUM_LEGS = 0;

    public Whale(String breed, String furColour, String habitat)
    {
        super(breed, furColour, habitat, NUM_LEGS);
    }

    public void swim()
    {
        System.out.println("Splash splash");
    }
}
