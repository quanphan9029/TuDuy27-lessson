package com.company;

import javax.swing.text.Style;
import java.util.Scanner;

public class DanNhapHam {
    public static void main(String[] args) {
        /*
         * Viết chương trình cho nhâp vào 2 số thực.
         * In ra 1 menu như sau:
         * MENU
         * 0. Thoát.
         * 1. In ra tổng 2 số.
         * 2. In ra hiệu 2 số.
         * 3. In ra tích 2 số.
         * 4. In ra thương 2 số.
         * Cho người dùng nhập vào lựa chọn từ 0 - 4.
         * Nếu nhập 0 thì dừng, còn lại thì xử lý theo lựa chọn.
         * In ra kết quả xong thì quay lại menu in tiếp. Cho người dùng chọn lại.
         */
        /*
         * Ẩn option người dùng đã chọn ở lần lặp tiếp theo.
         * Nếu chọn hết 4 option từ 1 tới 4 thì tự thoát.
         */

        Scanner sc = new Scanner(System.in);

        int option;
        double so_1,so_2;

        System.out.print("Nhập số thực thứ nhất: ");
        so_1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập số thực thứ hai: ");
        so_2 = Double.parseDouble(sc.nextLine());
        do {
            showMenu();
            System.out.print("Mời nhập lựa chọn: ");
            option = Integer.parseInt(sc.nextLine());

            xuLy(so_1,so_2,option);

        } while (option != 0);

    }

    public static void showMenu() {

        System.out.println("MENU:");
        System.out.println("0. Thoát.");


    }
    public static void xuLy(double so_1, double so_2, int option) {
        Scanner sc = new Scanner(System.in);

        if (option == 1) {
            System.out.println("Tổng 2 số là: " + (so_1 + so_2));
            sc.nextLine();
        }
        else if (option == 2) {
            System.out.println("Hiệu 2 số là: " + (so_1 - so_2));
            sc.nextLine();
        }
        else  if (option == 3) {
            System.out.println("Tích 2 số là:" + (so_1 * so_2));
            sc.nextLine();
        }
        else if (option == 4) {
            System.out.println("Thương 2 số là: " + (so_1 / so_2));
            sc.nextLine();
        }
    }
}
