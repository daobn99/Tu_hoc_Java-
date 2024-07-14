package basic_java;
import java.util.Scanner;

public class variables {
    public static void main(String[] args) {
        // int myNum = 15;
        // myNum = 20;  // myNum is now 20

        // float myFloatNum = 5.99f;
        // char myLetter = 'D';
        // boolean myBool = false;
        // String myText = "Hello Dao";

        // System.out.println(myNum);
        // System.out.println(myFloatNum);
        // System.out.println(myLetter);
        // System.out.println(myBool);
        // System.out.println(myText);

        // String firstName = "Dao";
        // String lastName = "Nguyen";
        // String fullName = firstName + lastName
        int num1, num2, sum;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        num1 = myobj.nextInt();
        System.out.println("Nhap so thu 2: ");
        num2 = myobj.nextInt();
        myobj.close();
        
        sum = num1 + num2;

        System.out.println("Tong 2 so la : " + sum);

        
    }
    
}
