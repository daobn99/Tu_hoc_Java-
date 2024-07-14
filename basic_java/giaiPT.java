package basic_java;
import java.util.Scanner;

public class giaiPT {
    public static void main(String[] args) {
        // //PT BAC NHAT
        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Nhap so nguyen a = ");
        // float a = sc.nextFloat();
        // System.out.print("Nhap so nguyen b = ");
        // float b = sc.nextFloat();

        // System.out.printf("Giai PT bac 2: %.0fx + %.0f = 0\n", a, b);

        // if (a == 0 && b == 0){
        //     System.out.println("Phuong trinh co vo so nghiem");
        // }else if (a == 0 && b != 0){
        //     System.out.println("Phuong trinh vo nghiem");
        // }else{
        //     System.out.println("Phuong trinh co nghiem x = " + (-b/a));
        // }

        //PT BAC 2

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen a = ");
        int a = sc.nextInt();

        System.out.print("Nhap so nguyen b = ");
        int b = sc.nextInt();

        System.out.print("Nhap so nguyen c = ");
        int c = sc.nextInt();

        System.out.println("==================");

        if (a == 0){
            float x = (float)-c/b;
            if (b == 0 && c == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else if (b == 0 && c != 0){
                System.out.println("Phuong trinh vo nghiem");
            }else{
                System.out.println("Phuong trinh co 1 nghiem x = " + x);
            }
            
        }else{
            float delta = (float)(b*b - 4*a*c);
            if (delta < 0){
                System.out.printf("Phuong trinh %dx^2 + %dx + %d vo nghiem\n", a, b, c);
            } else if (delta == 0){
                System.out.println("Phuong trinh co 2 nghiem kep");
                float x1 = (float) -b/2*a;
                float x2 = (float) -b/2*a;
                System.out.printf("Phuong trinh %dx^2 + %dx + %d co nghiem kep x1 = x2 = %.1f\n", a, b, c, x1);
                
            } else{
                float x1 = (float)(-b + Math.sqrt(delta)/(2*a));
                float x2 = (float)(-b - Math.sqrt(delta)/(2*a));
                System.out.println("Nghiem x1 = " + x1);
                System.out.println("Nghiem x2 = " + x2);
            }
        }



        sc.close();


    }
    
}
