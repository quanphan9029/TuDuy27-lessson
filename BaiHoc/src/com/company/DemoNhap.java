package com.company;

import java.util.Scanner;

public class DemoNhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String crushName;
        int year;

        System.out.print("Moi ban nhap vao ten nguoi minh yeu: ");
        crushName = sc.nextLine();
        System.out.println(crushName + " cung yeu minh.");

        System.out.print("Moi ban nhap nam sinh nguoi ban yeu: ");
        year = sc.nextInt();
        int age = 2019 - year;
        System.out.println("Nguoi ban yeu nam nay " + age + " tuoi.");

        if (year == 1995) {
            System.out.println("Ban va nguoi ban yeu bang tuoi nhau.");
        }
    }
}
