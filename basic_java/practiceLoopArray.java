package basic_java;
import java.util.Arrays;
import java.util.Scanner;

public class practiceLoopArray {
    public static void main(String[] args) {

        //BT Hoán đổi vị trí sắp xếp theo thứ tự từ bé đến lớn trong Array 
        int[] numbers = {4, 15, 6, 3, 20};
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
        

        // System.out.println("=======================");

        // // BT Nhập một số nguyên kiểm tra phải số nguyên tố ko 
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Nhap mot so nguyen bat ky: a = ");
        // int a = sc.nextInt();
        // int count = 0;
        // for (int i = 2; i <= a - 1; i++){
        //     if (a % i == 0){
        //         count++;
        //         break;
        //     }
        // }
        //     // System.out.println(count);
        // if (count == 0){
        //     System.out.printf("%d la so nguyen to", a);
        // } else{
        //     System.out.printf("%d khong la so nguyen to", a);
        // }
        // sc.close();
        

        // System.out.println("=======================");


        //BT Nhập vào một mảng số nguyên từ bàn phím và sắp xếp thứ tự, in ra phần tử max min
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter the number of size of array: ");
    //     int size = sc.nextInt();
    //     int[] numbers = new int[size];

    //     System.out.println("Enter the array element: ");
    //     for (int i = 0; i < size; i++){
    //         System.out.printf("Element %d = ", i + 1 );
    //         numbers[i] = sc.nextInt();
    //     }
    //     System.out.println("=============");
    //     System.out.println(Arrays.toString(numbers));
    //     System.out.println("===============");

    //     Arrays.sort(numbers);

    //     System.out.println(Arrays.toString(numbers));



    }
    
}
