package lab1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ and tên");
        String hoTen = scanner.nextLine();
        System.out.print("Average point:");
        double diemTB = scanner.nextDouble();
        System.out.printf("%s%f điểm số",hoTen,diemTB);


    }

    
}
    

