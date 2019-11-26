package com.company;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String docChuc = "",docDonvi = "";
        int n,hangChuc,hangDonvi;
        n = hangChuc = hangDonvi = 0;

        System.out.print("Nhap so nguyen N co 2 chu so: ");
        n = sc.nextInt();

        while (n > 99 || n < 10) {
            System.out.println("Loi nhap so. N la so co 2 chu so.");
            System.out.print("Moi nhap lai: ");
            n = sc.nextInt();
        }

        hangChuc = n/10;
        hangDonvi = n % 10;

        // Chuyen hang chuc sang chu
        switch (hangChuc) {
            case 1:
                System.out.println("Mười");
                break;
            case 2:
                System.out.println("Hai mươi");
                break;
            case 3:
                System.out.println("Ba mươi");
                break;
            case 4:
                System.out.println("Bốn mươi");
                break;
            case 5:
                System.out.println("Năm mươi");
                break;
            case 6:
                System.out.println("Sáu mươi");
                break;
            case 7:
                System.out.println("Bảy mươi");
                break;
            case 8:
                System.out.println("Tám mươi");
                break;
            case 9:
                System.out.println("Chín mươi");
                break;


        // Chuyen hang don vi sang chu
        switch (hangDonvi) {
            case  0:
                System.out.println(".");
            case 1: {
                if (hangChuc == 1) {
                    System.out.println(" một.");
                } else {
                    System.out.println(" mốt.");
                }
                break;
            }
            case 2:
                System.out.println(" hai.");
                break;
            case 3:
                System.out.println(" ba.");
                break;
            case 4:
                System.out.println(" bốn.");
                break;
            case 5:
                System.out.println(" năm.");
                break;
            case 6:
                System.out.println(" sáu.");
                break;
            case 7:
                System.out.println(" bảy.");
                break;
            case 8:
                System.out.println(" tám.");
                break;
            case 9:
                System.out.println(" chín.");
                break;
        }


        System.out.println(docChuc + docDonvi);
    }
    }
}
