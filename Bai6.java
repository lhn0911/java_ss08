package ss08;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "";
        int[] mang = new int[100];
        int n = 0;
        boolean choice = true;

        while (choice) {
            System.out.println("===== MENU CHINH =====");
            System.out.println("1. Xu ly chuoi");
            System.out.println("2. Xu ly so nguyen");
            System.out.println("3. Thoat chuong trinh");
            System.out.print("Chon chuc nang (1-3): ");
            int chon = scanner.nextInt();
            scanner.nextLine();

            if (chon == 1) {
                boolean choiceChuoi = true;
                while (choiceChuoi) {
                    System.out.println("===== MENU XU LY CHUOI =====");
                    System.out.println("1. Nhap chuoi");
                    System.out.println("2. Loai bo khoang trang thua");
                    System.out.println("3. Dem so lan xuat hien cua tung ky tu");
                    System.out.println("4. Chuyen doi chuoi thanh chuan");
                    System.out.println("5. Quay lai menu chinh");
                    System.out.print("Chon chuc nang (1-5): ");
                    int chonChuoi = scanner.nextInt();
                    scanner.nextLine();

                    if (chonChuoi == 1) {
                        System.out.print("Nhap chuoi: ");
                        chuoi = scanner.nextLine();
                    } else if (chonChuoi == 2) {
                        chuoi = chuoi.replaceAll("\\s+", " ").trim();
                        System.out.println("Chuoi sau khi xu ly: " + chuoi);
                    } else if (chonChuoi == 3) {
                        int[] dem = new int[256];
                        for (char c : chuoi.toCharArray()) {
                            dem[c]++;
                        }
                        for (int i = 0; i < 256; i++) {
                            if (dem[i] > 0) {
                                System.out.println((char) i + ": " + dem[i]);
                            }
                        }
                    } else if (chonChuoi == 4) {
                        String[] tu = chuoi.split(" ");
                        String ketQua = "";
                        for (String s : tu) {
                            if (!s.isEmpty()) {
                                ketQua += s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase() + " ";
                            }
                        }
                        chuoi = ketQua.trim();
                        System.out.println("Chuoi sau khi chuan hoa: " + chuoi);
                    } else if (chonChuoi == 5) {
                        choiceChuoi = false;
                    }
                }
            } else if (chon == 2) {
                boolean choiceSo = true;
                while (choiceSo) {
                    System.out.println("===== MENU XU LY MANG SO NGUYEN =====");
                    System.out.println("1. Nhap mang so nguyen");
                    System.out.println("2. Tim so nguyen to lon nhat trong mang");
                    System.out.println("3. Dem so phan tu co chu so dau tien la so le");
                    System.out.println("4. Kiem tra mang co phai la mang doi xung khong");
                    System.out.println("5. Quay lai menu chinh");
                    System.out.print("Chon chuc nang (1-5): ");
                    int chonSo = scanner.nextInt();

                    if (chonSo == 1) {
                        System.out.print("Nhap so luong phan tu: ");
                        n = scanner.nextInt();
                        for (int i = 0; i < n; i++) {
                            mang[i] = scanner.nextInt();
                        }
                    } else if (chonSo == 2) {
                        int maxNT = -1;
                        for (int i = 0; i < n; i++) {
                            boolean laNguyenTo = mang[i] > 1;
                            for (int j = 2; j * j <= mang[i]; j++) {
                                if (mang[i] % j == 0) {
                                    laNguyenTo = false;
                                    break;
                                }
                            }
                            if (laNguyenTo && mang[i] > maxNT) {
                                maxNT = mang[i];
                            }
                        }
                        System.out.println("So nguyen to lon nhat: " + maxNT);
                    } else if (chonSo == 3) {
                        int demLe = 0;
                        for (int i = 0; i < n; i++) {
                            String so = String.valueOf(mang[i]);
                            if (so.charAt(0) % 2 != 0) {
                                demLe++;
                            }
                        }
                        System.out.println("So phan tu co chu so dau tien la so le: " + demLe);
                    } else if (chonSo == 4) {
                        boolean doiXung = true;
                        for (int i = 0; i < n / 2; i++) {
                            if (mang[i] != mang[n - 1 - i]) {
                                doiXung = false;
                                break;
                            }
                        }
                        System.out.println("Mang " + (doiXung ? "doi xung" : "khong doi xung"));
                    } else if (chonSo == 5) {
                        choiceSo = false;
                    }
                }
            } else if (chon == 3) {
                choice = false;
            }
        }
        scanner.close();
    }
}
