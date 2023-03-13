// here we no need to write separate method for separate type of object
interface Animall
{
    void eat();
    void makeSound();
}
class Dogg implements Animall{
    @Override
    public void eat() {
        System.out.println("Dog eats Biscuits...");
    }

    @Override
    public void makeSound() {
        System.out.println("bhaw bhaw bhaw");
    }
}
class Catt implements Animall{
    @Override
    public void eat() {
        System.out.println("Cat eats Mango");
    }

    @Override
    public void makeSound() {
        System.out.println("maw maw maw");
    }
}
class Monkeyy implements Animall{
    @Override
    public void eat() {
        System.out.println("Monkey eats Banana");
    }

    @Override
    public void makeSound() {
        System.out.println("khi khik khickk");
    }
}
public class Test2 {
    public static void animalDetails(Animall a) // new Dogg()
                                // new Catt() // new Monkeyy()
    {
        a.eat();
        a.makeSound();
    }

    public static void main(String[] args) {
        animalDetails(new Dogg());
        animalDetails(new Catt());
        animalDetails(new Monkeyy());
    }
}

