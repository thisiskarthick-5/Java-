interface Animal {
    void sound();   // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
