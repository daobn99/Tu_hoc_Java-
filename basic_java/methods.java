package basic_java;
import java.util.Scanner;
public class methods {    
    static void checkAge(int age, String name){
        if (age < 18){
            System.out.printf("%s are not old enough", name);
        }else{
            System.out.printf("%s are old enough", name);
        }
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = sc.nextLine();
        System.out.printf("Enter your age: ");
        int age = sc.nextInt();

        checkAge(age, name);
        sc.close();
    }
    

    //---------------------------

    // static int calculate(int x, int y){
    //     return x + y;
    // }
    // public static void main(String[] args) {
    //     int z = calculate(3, 5);
    //     System.out.println(z);
    // }
}
