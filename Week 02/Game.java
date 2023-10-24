public class Game
{
    private final int END = 10;
    private Player players[];
    private Dice dice = new Dice();
    
    public Game()
    {
        setup();
        play();
        display();
    }
    
    private void setup()
    {
        players = new Player[readSize()];
        for(int i=0; i<players.length; i++)
        {
            players[i] = new Player(readName());
        }
    }
    
    private int readSize()
    {
        System.out.println("How many players?");
        return In.nextInt();
    }
    
    private String readName()
    {
        System.out.print("Enter player name: ");
        return In.nextLine();
    }
    
    private void play()
    {
        do
        {
            for(Player player : players)
            {
                player.turn(dice);
            }
        }
        while(!isGameOver());
    }
    
    private boolean isGameOver()
    {
        for(int i=0; i<players.length; i++)
        {
            if(players[i].getScore() > END)
                return true;
        }
        return false;
    }
    
    private void display()
    {
        System.out.println("Game Over");
        for(int i=0; i<players.length; i++)
        {
            System.out.println("\tPlayer "+ (i+1) +" Score: " + players[i].toString());
        }
    }
}
