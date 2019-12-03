package com.company;

import java.util.Scanner;

public class BaiTapWhile {
    public static void main(String[] args) {
        /* Viết chương trình nhập vào 1 số nguyên n bất kỳ
           Xây dụng công thức tính tổng 1 + 2 + 3 + ... + n
           Xuất ra tổng
         */

        Scanner sc = new Scanner(System.in);

        int soNhap,sum = 0;
        int dem = 0;
        soNhap = Integer.parseInt(sc.nextLine());
        while (dem <= soNhap) {
            sum+=dem;
            dem++;

        }
        System.out.println(sum);

        sum = 0; dem = 0;

        while (soNhap > 0) {
            sum+=soNhap;
            soNhap--;
        }
        System.out.println(sum);
    }
}
