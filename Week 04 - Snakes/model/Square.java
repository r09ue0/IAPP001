package model;
public class Square implements BoardPiece
{
    protected int id;
    protected String colour;
    protected int spacesToMove = 0;

    public Square(int id, String colour)
    {
        this.id = id;
        this.colour = colour;
    }
    
    public void move(Player player)
    {
        
    }
    
    @Override
    public String toString()
    {
        return "ID: "+ id + " Colour: "+ colour;
    }
}
