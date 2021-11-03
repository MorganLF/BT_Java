package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPhamTestDrive {
    
    private static Scanner in;

            public static void main(String[] args) {
                SanPham sp = new SanPham();
                SanPham sp1 = new SanPham();
                SanPham sp2 = new SanPham();
                sp.Nhap();
                sp1.Nhap();
                sp2.Nhap();
                sp.Xuat();
                sp1.Xuat();
                sp2.Xuat();
                int n;
        ArrayList<SanPham> list = new ArrayList<SanPham>();
        System.out.print("Nhap so luong phan tu: ");
        n = in.nextInt();
        for(int i=0;i<n;i++){
            SanPham sanPham = new SanPham();
            sp.Nhap();
            list.add(sp);
        }
        System.out.println(" thong tin cac san pham trong list");
        for(SanPham sPham: list){
            sPham.Xuat();
        }
    }
}

    

