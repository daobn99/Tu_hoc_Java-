package constructor;

public class Student {
    String name;
    int age;
    String address;

    public Student(){

    }
    public Student(String name, int age, String address2){
        // if (age < 0) {
        //     throw new IllegalArgumentException("Age cannot be negative");
        // }
        this.name = name;
        this.age = age;
        address = address2; // nếu tên tham số khác tên thuộc tính thì không cần this
    }
    void describe(){
        System.out.println(name + ", " + age + ", " + address);
    }
}
