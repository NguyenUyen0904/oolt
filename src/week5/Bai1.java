package week5;
// đếm  số từ của 1 xấu
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// tạo ra 1 đối tượng scanner mới
        System.out.println("Nhap vao 1 xau: ");
        String str = input.nextLine();// lệnh nhập vào 1 xấu .
        StringTokenizer strToken = new StringTokenizer(str, " ");
        /*
        đối tượng StringTokenizer để tách một xâu thành tập các xâu con, tham số thứ hai chính là xâu ký tự dùng
        để phân tách các xâu con. Trong bài tập này giữa các từ phân tách bằng dấu “  ”
         */
        System.out.println("So cac tu trong xau la: " +
                strToken.countTokens());// đếm các xâu con
    }

}

