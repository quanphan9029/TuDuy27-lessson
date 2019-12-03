package com.company;

import java.util.Scanner;

public class BaiTapDanNhapDoWhile {
    public static void main(String[] args) {
        /*
         * Viết chương trình cho nhập vào số nguyên liên tục ( âm dương đều được)
         * Nếu nhập 0 thì dừng
         * Xuất ra tổng của tất cả các sô vừa nhập
         */
        Scanner sc = new Scanner(System.in);

        /*
        int soNhap; int sum = 0;
        System.out.println("Nhập vào : ");
        soNhap = Integer.parseInt(sc.nextLine());

        while (soNhap != 0) {
            sum+=soNhap;
            System.out.println("Nhập vào : ");
            soNhap = Integer.parseInt(sc.nextLine());
        }
        System.out.println(sum);
        */

        // Fix
        /*
        int sum = 0;
        int soNguyen = 1;

        while (soNguyen != 0 ) {
            System.out.print("Mời nhập số: ");
            soNguyen = Integer.parseInt(sc.nextLine());
            sum += soNguyen;
        }
         */

        int soNguyen,sum = 0;
        do {
            System.out.print("Mời nhập số: ");
            soNguyen = Integer.parseInt(sc.nextLine());
            sum += soNguyen;
        } while (soNguyen != 0);
    }
}
