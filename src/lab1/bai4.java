package lab1;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();
        if (a==0) {
            System.out.println("Phuong trinh co no la: " + (-b/c));
        }
        else {
            double delta = b*b-4*a*c;
            if (delta < 0 ) {
                System.out.println("Phuong trinh no nghiem");
            }
            else if (delta==0) {
                double x = -b/2*a;
                System.out.println("Phuong trinh co no kep: " + x);
            }
            else {
                double x1 = (-b - Math.sqrt(delta))/2*a;
                double x2 = (-b + Math.sqrt(delta))/2*a;
                System.out.println("\nPhuong trinh co 2 no la: ");
                System.out.printf("\nx1= %.1f ", x1);
                System.out.printf("x2= %.1f\n ", x2);
            }
        }
    }
}


    

