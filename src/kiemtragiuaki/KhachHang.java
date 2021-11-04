package kiemtragiuaki;



public class KhachHang extends Nguoi {
    private static int hoTen;
    private String tenCongTy;
    private double triGiaHoaDon;
    protected KhachHang(String tenCongTy,double triGiaHoaDon){
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
    protected double gettriGiaHoaDon() {
        return (triGiaHoaDon);
    }
    @Override
    public String toString() {
        return "Họ Tên: " + this.hoTen + "trị Giá Hoá Đơn" + this.triGiaHoaDon;
    }
}
