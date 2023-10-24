/**
 * class Cat 
*/
public class Cat
{
    private String sex;
    private String breed;
    private int age;
    private boolean spayed;
    private String color;
    
    public Cat()
    {
    }
    
    public Cat(String sex, String breed, int age, boolean spayed, String color)
    {
        this.sex = sex;
        this.breed = breed;
        this.age = age;
        this.spayed = spayed;
        this.color = color;
    }
    
    /**
     * Miaow Method
    */
    public String miaow()
    {
        return "Miaow";
    }
    
    /**
     * eat Method
    */
    public String eat()
    {
       return "Munch";
    }
    
    /**
     * purr Method
    */
    public String purr()
    {
        return "Purrrr Purrrr";
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String toString()
    { 
        return "This "+ color +" cat is "+ age +" years old and "+ breed;
    }
}