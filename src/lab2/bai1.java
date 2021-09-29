package lab2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a,b;
        float x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        if (a==0) {
            if (b==0) {
                System.out.println("Phuong trinh vo so nghiem ");
            }
            else {
                System.out.println("Phuong trinh vo nghiem ");
            }
        }
        else
        {
        x = -b/a;
        System.out.printf("Phuong trinh co nghiem x = %.1f\n",x);
        }
    }
}
