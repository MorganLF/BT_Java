package lab2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int a,b,c;
        float x,x1,x2,delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        System.out.print("Nhap c: ");
        c = scanner.nextInt();
        if (a==0) {
            if (b==0) {
                if (c==0)
                    System.out.println("PT Vo so nghiem");
                    else System.out.println("PT vo nghiem");
                }
                else {
                    x= (float)(-b)/c;
                    System.out.printf("Nghiem Pt x= %.1f",x);
                }
            }
            else {
                delta = b*b-4*a*c;
                if (delta<0) {
                    System.out.println("PT Vo nghiem");
                }
                else if(delta==0) {
                    System.out.printf("PT co nghiem kep x = %.1f ",-b/2*a);
                }
                else {
                    x1 =(float)((-b) + Math.sqrt(delta))/(2*a);
                    x2 =(float)((-b) - Math.sqrt(delta))/(2*a);
                    System.out.printf("Nghiem x1 = %.1f ",x1);
                    System.out.printf("Nghiem x2 = %.1f ",x2);
                }
            }
        }
    }
