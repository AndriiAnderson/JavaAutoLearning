package Lesson4;

public class Task2 {
    public  static  void  main(String  args[]) {
        Boxer ourBoxer = new Boxer( 22, 77, 80);
        Boxer anotherBoxer = new Boxer( 35, 88 , 50);

        if (ourBoxer.fight(anotherBoxer))
            System.out.println("Your boxer's won!");
        if (!ourBoxer.fight(anotherBoxer))
            System.out.println("Your boxer's lost!");

    }
}
