package encapsulation;

public class TaiKhoanNganHang {
    private double soDu;

    public double getsoDu(){
        return soDu;
    }

    public void napTien(double soTien){
        if (soTien <= 0){
            throw new IllegalArgumentException("預け入れ金額は１円から入れてください");
        }
        soDu = soDu + soTien;
    }
    public void rutTien(double soTien){
        if (soTien > soDu){
            throw new IllegalArgumentException("引き出し金額は残高を上回っています。");
        }
        this.soDu = this.soDu - soTien;
    }

    
}
