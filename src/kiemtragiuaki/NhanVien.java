package kiemtragiuaki;

public class NhanVien extends Nguoi {
    private static int hoTen;
    private float heSoLuong;
    public String toString;
    public int salary;
    public NhanVien(String hoTen,float heSoLuong,int salary) {
        this.heSoLuong = heSoLuong;
        this.salary = salary;       
    }
    protected double getsalary() {
        return (heSoLuong*1500000);
    }
    @Override
    public String toString() {
        return "Họ Tên: " + this.hoTen + "Lương" + this.salary;
    }
}
