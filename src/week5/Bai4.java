package week5;

import java.util.Scanner;

public class Bai4 {

    public static String character(String strInput) {
        String output = "";

        for (int i = 0; i < strInput.length(); i++) {
            String character = "" + strInput.charAt(i);
            if (!output.contains(character)) {
                output += character;
            }
        }
        return output;

    }

    public static void check(String strInput){
        String out= character(strInput);
        for(int j=0;j<out.length();j++) {
            int count =0;
            for (int i = 0; i < strInput.length(); i++) {
                // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
                if (strInput.charAt(i) == out.charAt(j)) {
                    count++;
                }
            }

            System.out.println("Số lần xuất hiện của ký tự " + out.charAt(j) +
                    " trong chuỗi " + strInput + " = " + count);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String strInput = input.nextLine();
        check(strInput);

    }
}
