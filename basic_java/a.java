package basic_java;
import java.util.Scanner;
public class a{
    String name = "dao";

    public void gioiThieuTen(){
        System.out.println("Hello, im " + name);
    }

	public static void main(String[] args) {
        a idol = new a();
        idol.gioiThieuTen();
        // Scanner sc = new Scanner(System.in);
		// String genderInput = "yes";
		// float heightFeet = 5.5f; 

        // if (genderInput == "yes"){
        //     if (heightFeet > 6.0){
        //         System.out.println("you are tall as a man");
        //     }else{
        //         System.out.println("You are short as a man");
        //     }
        // } 


        // while (true) {
        //     System.out.print("Are you male (yes or no)? ");
        //     String genderInput = sc.nextLine();
        //     if (genderInput.equals("yes") || (genderInput.equals("no"))){
        //         break;
        //     }
        // }

        
        
	}
}