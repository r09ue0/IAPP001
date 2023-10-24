public class Player
{
    private String name;
    private int score = 0;
    
    public Player(String name)
    {
        this.name = name;
    }
    
    public void turn(Dice dice)
    {
        int rollValue = dice.roll();
        System.out.println(name +" rolled a "+ rollValue);
        score += rollValue;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public String toString()
    {
        return name +" "+ score;
    }
}