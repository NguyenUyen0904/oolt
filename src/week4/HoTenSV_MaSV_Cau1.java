package week4;

import java.util.Arrays;

public class HoTenSV_MaSV_Cau1 {
    private int[] a = new int[15];

    public HoTenSV_MaSV_Cau1(int[] a) {
        this.a = a;
    }

    public HoTenSV_MaSV_Cau1() {
        this.a = new int[]{};
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "HoTenSV_MaSV_Cau1{" +
                "a=" + Arrays.toString(a) +
                '}';
    }


    public int countElement(int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) count++;
        }
        return count;
    }

    public int countElement_2D(int[][] a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == n) count++;
            }
        }
        return count;
    }


}
