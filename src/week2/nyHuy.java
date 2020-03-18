package week2;

import java.util.Scanner;

public class nyHuy {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào số nguyên dương n có 3 chữ số  :");
//        int n = sc.nextInt();
//        for(int n=100;n<=999;n++) {
//            int a = n / 100;
//            int b = n % 100;
//            int c = b / 10;
//            int d = b % 10;
//            int nguoc = n * 1000 + d * 100 + c * 10 + a;
//            System.out.println("In ra số đẹp nè : " + nguoc);
//        }
//
        Scanner sc = new Scanner(System.in);
        //System.out.println("Nhập vào số nguyên dương n : ");
        int n = sc.nextInt();
        //System.out.println("Đang kiểm tra xem số đó có hoàn hảo ko. Đợi xíu ahihi");
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        if (sum == n) System.out.println("YES");
        else System.out.println("NO");

    }
}
