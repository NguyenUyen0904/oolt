package week2;
// bài vd1 trên lớp , tính tổng và giá trị trung bình của 1 mảng số nguyên

import javax.swing.*;
import java.lang.reflect.Array;

public class VD1 {
    public static void main(String[] args) {
        int[] array ={1,3,2,4};

        int sum=0;
        float avg=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];}

        System.out.println("Tong cua cac so trong mang la: "+sum);
        avg =sum/4.0f;
        System.out.println("Gia tri trung binh la: "+avg);
        int min, max;
        min=max=array[0];
        for(int j=1;j<array.length;j++)
        {
            if (max<=array[j])
                max=array[j];
            if(min>=array[j]) min=array[j];




        }
        System.out.println("Min="+min+" va max= "+max);



    }
}
