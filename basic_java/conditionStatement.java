package basic_java;
//Statement: câu lệnh 
import java.util.Scanner;
public class conditionStatement {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhap tien thue: ");
        // int thue = sc.nextInt();

        // if (thue < 10){
        //     System.out.println("khong dong thue");
        // }else if (thue >= 10 && thue < 15){
        //     System.out.println("Thue 20%");
        // }else{
        //     System.out.println("Thue 50%");
        // }
        
        // System.out.println("Nhap 1 so: ");
        // int day = sc.nextInt();
        int day = 1;
        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            
            default:
                System.out.println("T");
                break;
        }

        
        
    }
    
    
}
