package week4;

import java.util.Scanner;

public class MaSV_Cau1_Testing {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, -1, -2, -3, -4, -5};
        int[] b = {1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 6, 7, 7, 9, 9};
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 6, 5, 4, 3, 2};
        int[] d = {9, 8, 7, 6, 5, 4, 3, 2, 1, 3, 4, 5, 6, 7, 8};
        HoTenSV_MaSV_Cau1 array1 = new HoTenSV_MaSV_Cau1(a);
        HoTenSV_MaSV_Cau1 array2 = new HoTenSV_MaSV_Cau1(b);
        HoTenSV_MaSV_Cau1 array3 = new HoTenSV_MaSV_Cau1(c);
        HoTenSV_MaSV_Cau1 array4 = new HoTenSV_MaSV_Cau1(d);

        System.out.println(array1.countElement(8));
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {3, 4, 5, 7, 7}
        };
        System.out.println(array1.countElement_2D(arr, 7));

    }
}
