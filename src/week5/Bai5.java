package week5;

import java.util.Scanner;

public class Bai5 {
    public static void check( String strInput1,String strInput2){
        StringBuffer stringBuffer = new StringBuffer(strInput1);
        String result =  stringBuffer.reverse().toString();
        if(strInput2.equals(result)==true) System.out.println("anagram!!!!!");
        else System.out.println(" ko phai anagram!");

        }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao xau thu nhat: ");
        String strInput1 = input.nextLine();
        System.out.println("Nhap vao xau thu 2: ");
        String strInput2 = input.nextLine();
        check(strInput1,strInput2);
    }
}
