package Polymorphism;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    @Override // khi có @Override thì java hiểu ngay là sẽ có ghi đè và báo lỗi khi viết sai method
    public void animalsound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalsound() { // Do ko có @Override nên java ko báo lỗi mặc dù "sound" ko viết hoa chữ S
        System.out.println("The dog says: bow wow");
    }
}

class Cat extends Animal {
    public void animalSound() { // Chương trình đúng, nhưng nên viết @Override ở đầu
        System.out.println("The cat says: meo meow");
    }
}

public class daHinh {
    public static void main(String[] args) {
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        myPig.animalSound();
        myDog.animalSound();
        myCat.animalSound();
    }
}
