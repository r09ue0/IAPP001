public class Whale extends Mammal
{
     public Whale(String breed, String furColour, String habitat, int numLegs)
     {
         super(breed, furColour, habitat, numLegs);
     }
     
     public void swim()
     {
         System.out.println("Whale swims in "+ habitat);
     }
}
