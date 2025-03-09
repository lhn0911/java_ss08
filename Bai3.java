package ss08;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String password;

        while (true) {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            String emailRegex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.(com|vn|org)$";
            if (Pattern.matches(emailRegex, email)) {
                break;
            } else {
                System.out.println("Email khong hop le, vui long nhap lai!");
            }
        }

        while (true) {
            System.out.print("Nhap mat khau: ");
            password = scanner.nextLine();
            String passwordRegex = ".*(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!&*]).{8,}.*";
            if (Pattern.matches(passwordRegex, password)) {
                break;
            } else {
                System.out.println("Mat khau khong hop le, vui long nhap lai!");
            }
        }

        System.out.println("Email va mat khau hop le!");
    }
}
