package lab4;

import java.util.Scanner;

public class customer {
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);
    void getName() {
        System.out.print("ho va ten cua khach hang : ");
        name = scanner.nextLine();
    }
    void getAdress() {
        address = scanner.nextLine();
        System.out.print("dia chi cua khach hang : ");
    }
    void showData() {
        System.out.println("ten cua khach hang: "+name);
        System.out.println("dia chi cua khach hang:"+address);
    }
}
    

