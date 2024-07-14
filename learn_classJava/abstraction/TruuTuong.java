package abstraction;

abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void animalSound();   //Không có void là nó bắt return cái gì đó, nên phải viết 

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        // Phần thân của animalSound() đc cung cấp ở đây 
        System.out.println("The pig says: wee wee");
    }
}

class Cat extends Animal {
    @Override
    public void animalSound() {
        // Phần thân của animalSound() đc cung cấp ở đây 
        System.out.println("The cat says: meo meow");
    }
}

public class TruuTuong {
    public static void main(String[] args) {
        // Animal animal = new Animal();   Dòng này báo lỗi vì abstract class không thể tạo đối tượng (bảo mật tốt hơn không muốn người dùng truy cập vào lớp cha)  
        Animal myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        Animal myCat = new Cat();
        myCat.animalSound();
        myCat.sleep();
    }
}

//Sleep con nào cũng Zzzz nhưng Sound khác nhau. Phần khác nhau thì ghi đè Override, phần giống nhau thì dùng luôn