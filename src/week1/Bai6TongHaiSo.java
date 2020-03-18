package week1;

import javax.swing.*;

public class Bai6TongHaiSo {
    public static void main(String[] args){

        String strSo1, strSo2;
        String strHienThi = "Tổng của 2 số ";

        strSo1 = JOptionPane.showInputDialog(null,
                "Hãy nhập số thứ 1: ","Nhập số thứ nhất ",
                JOptionPane.INFORMATION_MESSAGE);
        strHienThi += strSo1 + " và ";

        strSo2 = JOptionPane.showInputDialog(null,
                "Hãy nhập số thứ 2: ","Nhập số thứ hai",
                JOptionPane.INFORMATION_MESSAGE);
        strHienThi += strSo2+" là "+(Integer.parseInt(strSo1)+ Integer.parseInt(strSo2));

        JOptionPane.showMessageDialog(null,strHienThi,
                "Tong 2 so ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
