package week1;

import javax.swing.*;
import java.util.Scanner;

public class Bai4TamGiac {
    public static void main(String[] args) {
        //--- bài vẽ tam giác ------
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của hình tam giác vuông :");
        int h = sc.nextInt();
        for (int i=1;i<=h;i++){
            for (int k=1;k<=i;k++)
                System.out.print("*");
            System.out.print( "\n");
        }
        System.out.println("Nhập vào chiều cao của hình tam giác cân :");
        int h1 = sc.nextInt();

        for (int i = 1; i <= h1; i++)
        {
            for (int j = i; j <= h1- 1; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2 - 1; k++)
                System.out.print("*");
            System.out.print("\n" );

        }

    }
}
