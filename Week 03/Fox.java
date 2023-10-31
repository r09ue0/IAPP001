public class Fox extends Dog
{
    private boolean canClimbTree;
    
    public Fox(String breed, String furColour, String habitat, double tailLength, boolean canClimbTree)
    {
        super(breed, furColour, habitat, tailLength);
        this.canClimbTree = canClimbTree;
    }
    
    @Override
    public String feed()
    {
        return "meat";
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "Can Climb Trees: "+ canClimbTree;
    }
}
