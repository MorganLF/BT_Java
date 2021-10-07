package lab4;

import java.util.Scanner;

public class employee {
    String name;
    String salary;
    Scanner scanner = new Scanner(System.in);
    void getName() {
        System.out.print("ho va ten cua nhan vien : ");
        name = scanner.nextLine();
    }
    void getSalary() {
        salary = scanner.nextLine();
        System.out.print("luong cua nhan vien : ");
    }
    void showData() {
        System.out.println("ho va ten cua nhan vien: "+name);
        System.out.println("luong cua nhan vien: "+salary);
    }
}
    

