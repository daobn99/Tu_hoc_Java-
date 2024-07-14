package basic_java;
import java.util.Scanner;
public class practiceMethods {
    static String askPersonInfor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your first name: ");
        String firstName = sc.nextLine(); 
        System.out.println("Your last name: ");
        String lastName = sc.nextLine();

        return firstName;
        // return lastName;

    }
    public static void main(String[] args) {
        String firstName = askPersonInfor();
        String lastName = askPersonInfor();
        System.out.println("Your name is " + firstName);

    }
}
