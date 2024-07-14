package basic_java;
/*type casting: Ép kiểu
Widening Casting (automatically): ép kiểu rộng : chuyển loại nhỏ thành loại lớn (byte-> short-> char-> int-> long-> float->double)
Narrowing Casting (manually): ép hẹp : chuyển loại lớn thành nhỏ (double-> float-> long-> int-> char-> short->byte)
*/
public class typeCasting {
    public static void main(String[] args) {
        // //automatic casting
        // byte a = 7;
        // float b = a;
        // System.out.println(a);      // Outputs 7
        // System.out.println(b);   // Outputs 7.0


        // System.out.println("------------------");

        // //Manual casting
        // double myDouble = 10.78;
        // int myInt = (int) myDouble; // Manual casting: double to int

        // System.out.println(myDouble);   // Outputs 10.78
        // System.out.println(myInt);      // Outputs 10

        // System.out.println("------------------");

        // long c = 50;
        // short d = (short)c;        //chuyển từ dữ liệu lớn sang bé thì cần viết lệnh ở thằng bé trong ngoặc (short, int...)
        // System.out.println(d);

        int maxScore = 500;
        int studentScore = 423;

        // float percentage = (float) studentScore/maxScore*100;
        float percentage = (float)studentScore/maxScore;
        System.out.println("Phan tram diem cua hoc sinh la: " + percentage);
        

    }
}



/* nói chung là,
Ép rộng tức là ban đầu có một giá trị nhỏ (byte), sau đó tạo ra một giá trị lớn hơn (float) 
gán bằng thằng nhỏ ban đầu. Ép rộng thì không cần khai báo biến lớn trong ngoặc float = byte  

ÉP hẹp là ban đầu có một thằng to (float), sau đó muốn tạo ra một giá trị nhỏ hơn (byte)
gán bằng thằng to ban đầu. Ép hẹp thì cần khai báo biến nhỏ trong ngoặc byte = (byte)float 

 
 */