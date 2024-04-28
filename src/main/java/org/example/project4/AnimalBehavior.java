package org.example.project4;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makeSound();

}
abstract class Animal implements AnimalBehavior{
    @Override
    public void sleep(){
        System.out.println("Note: This animal is not nocturnal");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public abstract void displayInfo();
}
class Mammal extends Animal{

    @Override
    public void eat() {
        System.out.print("This mammal eat: ");
    }

    @Override
    public void makeSound() {
        System.out.print("Sounds of this mammal called: ");
    }

    @Override
    public void displayInfo() {
        System.out.println("Mammal info: ");

    }
}

class Lion extends Mammal{
    private String name;
    private int age;
    private String origin;

    public Lion(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("meat");

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("roar");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lion: name "+name+", age "+age+", origin "+origin);

    }
}
class Elephant extends Mammal{
    private String name;
    private int age;
    private String origin;

    public Elephant(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Grass, fruits and vegs");

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("trumpet");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Elephant: name "+name+", age "+age+", origin "+origin);

    }
}
class Bird extends Animal{

    @Override
    public void eat() {
        System.out.print("This bird eats: ");
    }

    @Override
    public void makeSound() {
        System.out.print("The sound of this bird called: ");

    }

    @Override
    public void displayInfo() {
        System.out.println("Bird info: ");
    }
}

class Parrot extends Bird{
    private String name;
    private int age;
    private String origin;

    public Parrot(String name, int age, String origin) {
        this.name = name;
        this.age = age;
        this.origin = origin;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("fruits and vegetables");

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("squawk");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Parrot: name "+name+", age "+age+", origin "+origin);
    }
}
class Eagle extends Bird{
    private String name;
    private int age;
    private String origin;
    public Eagle(String name, int age, String origin){
        this.name=name;
        this.age=age;
        this.origin=origin;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("fish");

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("screech");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Eagle: name "+name+", age "+age+", origin "+origin);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Mammal [] mammal={new Lion("Selen",3,"Bangladesh"),
                new Elephant("Grumpy",7,"Indonesia")};
        for(Mammal m:mammal){
            m.displayInfo();
            m.eat();
            m.makeSound();
            m.sleep();
        }
        Bird[]birds={new Parrot("Lucy",2,"Bali"),
                new Eagle("Baldy",5,"USA")};
        for(Bird b:birds){
            b.displayInfo();
            b.eat();
            b.makeSound();
            b.sleep();
        }
    }
}
