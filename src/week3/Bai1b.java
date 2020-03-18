package week3;

import java.util.Scanner;

public class Bai1b {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ 1:");
        int a = sc.nextInt();
        System.out.println("Nhập số thứ 2:");
        int b = sc.nextInt();
        int tong = a + b;
        System.out.println("Tổng 2 số là : " + tong);
        int hieu = a - b;
        System.out.println("Hiệu số đầu trừ số thứ 2 là : " + hieu);
        int tich = a * b;
        System.out.println("Tích 2 số là : " + tich);
        int thuong = a / b;
        System.out.println("Thương của số dầu chia số thứ 2 là :" + thuong);
    }


}
