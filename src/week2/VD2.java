package week2;

import java.util.Scanner;

// Tính tổng dãy 1+1/2+1/3+...+1/n; n nhập vào từ bàn phím
public class VD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n :");
        int n = sc.nextInt();
        float sum=0;

        for(int i=1;i<=n;i++){
            sum+=1f/i;
        }
        System.out.println("sum="+sum);

    }
}
