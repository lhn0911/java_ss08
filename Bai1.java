package ss08;

import java.util.Scanner;

public class Bai1 {
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
                    System.out.println("Kich thuoc khong hop le!");
                }
            } else {
                System.out.println("Kich thuoc khong hop le");
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
                    System.out.println("Gia tri khong hop le!");
                    scanner.next();
                }
            }
        }

        int maxValue = mang[0];
        int minValue = mang[0];

        for (int i = 1; i < n; i++) {
            if (mang[i] > maxValue) {
                maxValue = mang[i];
            }
            if (mang[i] < minValue) {
                minValue = mang[i];
            }
        }

        System.out.println("Gia tri lon nhat trong mang: " + maxValue);
        System.out.println("Gia tri nho nhat trong mang: " + minValue);
    }
}
