package basic_java;
public class dataType {
    public static void main(String[] args) {
        String tenSach = "Lap trinh Java";
        int namXuatBan = 2021;
        float giaTien = 15.5f;                     //float trong java cần có chữ f ở cuối biến 
        double giaTien2 = 20.3d;                    //double độ rộng vừa to hơn float và ko cần f ở cuối
        boolean conSach = true;
        char maKho = 'M';

        System.out.println("Ten sach: " + tenSach);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Gia tien: " + giaTien);
        System.out.println("Gia tien 2: " + giaTien2);
        System.out.println("Con sach hay khong: " + conSach);
        System.out.println("Ma kho: " + maKho); 
    }

}
