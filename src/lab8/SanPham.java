package lab8;

import java.util.Scanner;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double SaleOff;
    protected void Nhap() {
        Scanner scanner = new Scanner(System.in);
        tenSP = scanner.nextLine();
        donGia = scanner.nextDouble();
        SaleOff = scanner.nextDouble();
        System.out.print("Ten san pham la: ");
        System.out.print("Don gia la: ");
        System.out.print("So tien giam la: ");
    }
    protected void Xuat() {
        System.out.println("Ten san pham: "+tenSP);
        System.out.println("Don gia: "+donGia);
        System.out.println("SaleOff: "+SaleOff);
        System.out.println("Thue nhap khau: "+getThueNhapKhau()+"$");
    }
    public String getTenSP() {
        return tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getSaleOff() {
        return SaleOff;
    }
    public void setSaleOff(double SaleOff) {
        this.SaleOff = SaleOff;
    }
    public double getThueNhapKhau() {
        double thue;
        thue = (donGia*10)/100;
        return thue;
    }

    
}
