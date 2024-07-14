package Inheritance;

class Animal {
    int age;
    String name;

    public void Eat() {
        System.out.println("動物が今食べている");
    }

    public void Sleep() {
        System.out.println("動物は今寝ている");
    }

    public void describle() {
        System.out.println(name + "ちゃん, " + age + " 歳");
    }
}

class Cat extends Animal {
    @Override
    public void Eat() {
        System.out.println("魚を食べている");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    @Override
    public void Eat() {
        System.out.println("骨を食べている");
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class VD2 {
    public static void main(String[] args) {
        Animal nekochan = new Cat("kity", 1);
        nekochan.describle();
        nekochan.Eat();

        Animal wanchan = new Dog("Shiba", 1);
        wanchan.describle();
        wanchan.Eat();

    }
}
