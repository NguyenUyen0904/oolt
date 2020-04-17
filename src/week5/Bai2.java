package week5;
/*
Bài 2)	Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ các dấu cách thừa,
 chuyển ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành chữ thường)
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai2 {
    public static String chuyenInHoa(String str){
        String s,strOutput;
        s= str.substring(0, 1);
        strOutput= str.replaceFirst(s,s.toUpperCase());
        return (strOutput);
    }
    public static String chuanHoa(String strInput){
        String strOutput="";
        StringTokenizer strToken = new StringTokenizer(strInput," ,\t,\r,...");
        strOutput+=""+chuyenInHoa(strToken.nextToken());
        while(strToken.hasMoreTokens()){
            strOutput+=" "+chuyenInHoa(strToken.nextToken());
        }
        return(strOutput);
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input= new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String strInput= input.nextLine();
        System.out.println("Xau duoc chuan hoa la:" +
                chuanHoa(strInput));
    }

}
