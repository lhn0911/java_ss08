package ss08;

import java.util.Scanner;
import java.util.ArrayList;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mang = new ArrayList<>();
        boolean choice = true;

        while (choice) {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap gia tri n phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang");
            System.out.println("3. Tinh trung binh cac phan tu duong");
            System.out.println("4. Tim vi tri cac phan tu co gia tri bang k");
            System.out.println("5. Tinh so luong cac phan tu la so nguyen to");
            System.out.println("6. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            if (chon == 1) {
                System.out.print("Nhap so luong phan tu: ");
                int n = scanner.nextInt();
                System.out.println("Nhap cac phan tu: ");
                mang.clear();
                for (int i = 0; i < n; i++) {
                    mang.add(scanner.nextInt());
                }
            } else if (chon == 2) {
                System.out.println("Cac phan tu trong mang: " + mang);
            } else if (chon == 3) {
                int tong = 0, count = 0;
                for (int so : mang) {
                    if (so > 0) {
                        tong += so;
                        count++;
                    }
                }
                System.out.println("Trung binh cac so duong: " + (count > 0 ? (double) tong / count : 0));
            } else if (chon == 4) {
                System.out.print("Nhap gia tri k: ");
                int k = scanner.nextInt();
                System.out.print("Vi tri cac phan tu bang k: ");
                for (int i = 0; i < mang.size(); i++) {
                    if (mang.get(i) == k) System.out.print(i + " ");
                }
                System.out.println();
            } else if (chon == 5) {
                int soLuongNT = 0;
                for (int so : mang) {
                    if (so > 1) {
                        boolean laNguyenTo = true;
                        for (int j = 2; j * j <= so; j++) {
                            if (so % j == 0) {
                                laNguyenTo = false;
                                break;
                            }
                        }
                        if (laNguyenTo) soLuongNT++;
                    }
                }
                System.out.println("So luong so nguyen to: " + soLuongNT);
            } else if (chon == 6) {
                choice = false;
            } else {
                System.out.println("Lua chon khong hop le!");
            }
        }
        scanner.close();
    }
}
