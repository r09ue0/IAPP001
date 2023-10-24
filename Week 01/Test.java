public class Test
{
    private Cat cats[] = {
        new Cat("male", "stupid", 5, true, "black"),
        new Cat("female", "dumbass", 3, false, "white"),
        new Cat("male", "god", 10, false, "gold")
    };
    private final char YES = 'Y';
    
    public Test()
    {
        menu();
    }
    
    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'D': display(); break;
            case 'R': report(); break;
            case 'X': exit(); break;
            case '?': help(); break;
            default: error();
        }
    }

    private char readAction()
    {
        System.out.println("Please enter your choice ( D, R, X, ?): ");
        return In.nextUpperChar();
    }
    
    private void exit()
    {
        if (!confirm())
            menu();
        else
            System.out.println("Good Bye");
    }

    private boolean confirm()
    {
        System.out.println("Are you sure (y/n)?: ");
        return In.nextUpperChar() == YES;
    }

    private void help()
    {
        System.out.println("Welcome to my simple menu; enter");
        System.out.println("D for Display");
        System.out.println("R for Report");
        System.out.println("X to exit");
        menu();
    }
    
    private void error()
    {
        System.out.println("No action found. Try again");
        menu();
    }

    public void display(Cat cat)
    {
        System.out.println(cat.toString());
    }
    
    public void display()
    {
        for(Cat cat : cats)
        {
            display(cat);
        }
        menu();
    }
    
    private int readAge()
    {
        System.out.print("Enter Age to Search: ");
        return In.nextInt();
    }
    
    public void report()
    {
        int minAge = readAge();
        for(Cat cat : cats)
        {
            if(cat.getAge() >= minAge)
                display(cat);
        }
        menu();
    }
}