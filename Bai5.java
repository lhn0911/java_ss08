package ss08;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[0];
        boolean choice = true;

        while (choice) {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhập giá trị n phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương");
            System.out.println("4. Tìm vị trí các phần tử có giá trị bằng k");
            System.out.println("5. Tính số lượng các phần tử là số nguyên tố");
            System.out.println("6. Thoát chương trình");
            System.out.print("Chọn chức năng: ");
            int chon = scanner.nextInt();

            if (chon == 1) {
                System.out.print("Nhập số lượng phần tử: ");
                int n = scanner.nextInt();
                arr = new int[n];
                System.out.println("Nhập các phần tử: ");
                for (int i = 0; i < n; i++) {
                    arr[i] = scanner.nextInt();
                }
            } else if (chon == 2) {
                System.out.print("Các phần tử trong mảng: ");
                for (int num : arr) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else if (chon == 3) {
                int tong = 0, count = 0;
                for (int so : arr) {
                    if (so > 0) {
                        tong += so;
                        count++;
                    }
                }
                System.out.println("Trung bình các số dương: " + (count > 0 ? (double) tong / count : 0));
            } else if (chon == 4) {
                System.out.print("Nhập giá trị k: ");
                int k = scanner.nextInt();
                System.out.print("Vị trí các phần tử bằng k: ");
                boolean found = false;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == k) {
                        System.out.print(i + " ");
                        found = true;
                    }
                }
                if (!found) System.out.print("Không tìm thấy!");
                System.out.println();
            } else if (chon == 5) {
                int soLuongNT = 0;
                for (int so : arr) {
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
                System.out.println("Số lượng số nguyên tố: " + soLuongNT);
            } else if (chon == 6) {
                choice = false;
            } else {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }
        scanner.close();
    }
}
