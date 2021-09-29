package lab2;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        float soDien;
        double soTien;
        System.out.println("tong so dien trong thang la : ");
        Scanner bien = new Scanner(System.in);
        soDien = bien.nextFloat();
        if(soDien <= 50){
        soTien = soDien*1000;
        System.out.println("vay tong so tien dien thang nay la : " +soTien);
        }
        else{
            soTien = 50*1000 + (soDien - 50)*1200 ;
            System.out.println("Vay tong so tien dien thang nay la "+soTien);
            }
        }
    
    
}
    
    

