interface Animal
{
    void eat();
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats Biscuits...");
    }

    @Override
    public void makeSound() {
        System.out.println("bhaw bhaw bhaw");
    }
}
class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats Mango");
    }

    @Override
    public void makeSound() {
        System.out.println("maw maw maw");
    }
}
class Monkey implements Animal{
    @Override
    public void eat() {
        System.out.println("Monkey eats Banana");
    }

    @Override
    public void makeSound() {
        System.out.println("khi khik khickk");
    }
}
public class Test1 {

    public static void dogDetails(Dog d)
    {
        d.eat();
        d.makeSound();
    }
    public static void catDetails(Cat c)
    {
        c.eat();
        c.makeSound();
    }
    public static void monkeyDetails(Monkey m)
    {
        m.eat();
        m.makeSound();
    }
    public static void main(String[] args) {
            dogDetails(new Dog());
            catDetails(new Cat());
            monkeyDetails(new Monkey());
    }

}
