package week5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// tạo ra 1 đối tượng scanner mới
        System.out.println("Nhap vao 1 xau: ");
        String str = input.nextLine();// lệnh nhập vào 1 xấu .
        String[] strings2 = str.split(" ");
        System.out.print(strings2[strings2.length - 1]);
        for (int i = 0; i < strings2.length - 1; i++) {
            System.out.print(" " + strings2[i]);
        }
    }
}
