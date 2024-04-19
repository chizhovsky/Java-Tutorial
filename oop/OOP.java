package oop;

public class OOP {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Animal();

        dog.setName("Sharik");
        cat.setName("Murka");

        System.out.println("Dog's name is " + dog.getName() + ". Cat's name is " + cat.getName());
        System.out.println("Dog says " + dog.voice() + ". Cat says " + cat.voice());
        System.out.println("Cow says " + cow.voice());
    }
}
