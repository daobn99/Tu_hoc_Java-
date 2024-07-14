package basic_java;
import java.util.Scanner;

public class practiceDatapy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CURRENT_YEAR = 2024;
        float METER_TO_FEET = 3.28f;
        
        System.out.println("Your first name: ");
        String firstName = sc.nextLine();
       
        System.out.println("Your last name: ");
        String lastName = sc.nextLine();
        
        String genderInput;
        while (true) {
            System.out.print("Are you male (yes or no)? ");
            genderInput = sc.nextLine();
            if (genderInput.equals("yes") || (genderInput.equals("no"))){
                break;
            }
        }
        
        System.out.println("When you were born? ");
        int yearBorn = sc.nextInt();
        int age = CURRENT_YEAR - yearBorn;

        System.out.println("Enter your height (meter): ");
        float heightMeter = sc.nextFloat(); 
        float heightFeet = heightMeter*METER_TO_FEET;
        
        // System.out.println("Are you male? (yes or no) ");
        // String genderInput = sc.nextLine();

        // String genderInput;
        // while (true) {
        //     System.out.print("Are you male (yes or no)? ");
        //     genderInput = sc.nextLine();
        //     if (genderInput.equals("yes") || (genderInput.equals("no"))){
        //         break;
        //     }
        // }
        
        System.out.println("-------------");
        System.out.println("Your name is " + firstName + " " + lastName );
        System.out.println(firstName + " " + "is " + age + " years old in " + CURRENT_YEAR);
        System.out.println("You are tall " + heightFeet + " feet tall");
        
        if (genderInput.equals("yes")){
            if (heightFeet > 6.5){
                System.out.print("you are ");
                for (int i = 0; i < 10; i++){
                    System.out.print("very ");
                }
                System.out.print("tall");
            }
            else if (heightFeet > 6.0){
                System.out.println("you are tall as a man");
            }else{
                System.out.println("You are short as a man");
            }
        }else{
            if (heightFeet > 5.5){
                System.out.println("You are tall as a girl");
            }else{
                System.out.println("You are short as a girl");
            }
        } 
        
	    sc.close();
    }
    
}
