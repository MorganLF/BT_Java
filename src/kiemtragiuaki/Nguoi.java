package kiemtragiuaki;

import java.util.Scanner;

import kiemtragiuaki.HocVien;

public class Nguoi extends DanhSachQuanLi {
    private String hoTen, DiaChi;
    private int tuoi;
    Scanner scanner = new Scanner(System.in);
     
    public Nguoi(String hoTen2, float diemmonhoc1, float diemmonhoc2, int soluongHV) {
        super();
    }
 
    public Nguoi(String hoTen, String DiaChi, int tuoi) {
        super();
        this.hoTen = hoTen;
        this.DiaChi= DiaChi;
        this.tuoi = tuoi;

    }
 
 
    public Nguoi(String hoTen2, float heSoLuong) {
    }

    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public String getDiaChi() {
        return DiaChi;
    }
 
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    } 
    public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }   
    public void nhap() {

        System.out.print("enter ho va ten nv: ");
        hoTen = scanner.nextLine();
        System.out.print("enter dia chi: ");
        DiaChi = scanner.nextLine();
        System.out.print("enter tuoi: ");
        tuoi = scanner.nextInt();
    }
     
    @Override
    public String toString() {
        return "ma nhan vien: " + this.DiaChi + ", ho va ten nhan vien: " + this.hoTen + ", sdt: " + this.tuoi;
    }
}