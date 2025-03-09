package ss08;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Nhap so luong phan tu: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Kich thuoc khong hop le.");
                }
            } else {
                System.out.println("Kich thuoc khong hop le.");
                scanner.next();
            }
        }

        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    mang[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Gia tri khong hop le");
                    scanner.next();
                }
            }
        }

        int sum = 0;
        boolean found = false;
        for (int num : mang) {
            if (num % 3 == 0) {
                sum += num;
                found = true;
            }
        }

        if (found) {
            System.out.println("Tong = " + sum);
        } else {
            System.out.println("Khong co so chia het cho 3");
        }
    }
}
