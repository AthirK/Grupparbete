package Grupparbete;

public class MyAnimal
{
    public void myDonkey()
    {
        System.out.println("Donkey.");
    }

    @AutoCall
    public void myHorseTwo()
    {
        System.out.println("First Horse.");
    }

    @AutoCall
    public void myHorseThree()
    {
        System.out.println("Second Horse.");
    }
}
