class Animal{
    Animal(){
        System.out.println("Animal Constructor");
    }
    public void makesound(){
        System.out.println("Making a sound");
    }
}

class Dog extends Animal{
    Dog(){
        super();
        System.out.println("Dog constructor");
    }
    public void bark(){
        super.makesound();
    }
}

public class Mains1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
