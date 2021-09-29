package lab1;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanh = new Scanner(System.in);
        System.out.print("Nhap canh lap phuong: ");
        double canh = scanh.nextDouble();
        double theTich = canh*canh*canh;
        System.out.printf("The tich cua khoi lap phuong: %.1f \n", theTich);
    }  
}
