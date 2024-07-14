package encapsulation;

public class MainTaiKhoanNganHang {
    public static void main(String[] args) {
        TaiKhoanNganHang myBank = new TaiKhoanNganHang();
        myBank.soDu = 100000;
        myBank.napTien(5);
        myBank.rutTien(10);
        
        
        System.out.println(myBank.getsoDu());
    }
}
