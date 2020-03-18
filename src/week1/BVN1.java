package week1;

import java.util.Scanner;

public class BVN1 {
    public static void main(String args[]) {
        bacNhat();
        bacHai();
    }

    public static void bacNhat() {
        System.out.println("Giải phương trình bậc nhất có dạng : a*x+b=c");
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();
        System.out.print("c = ");
        float c = sc.nextFloat();
        if (a == 0) {
            if (b == c) System.out.println("Phương trình vô số nghiệm !");
            else System.out.println("Phương trình vô nghiệm ");
        } else {
            float x = (c - b) / a;
            System.out.println("Nghiệm của phương  trình x= " + x);
        }

    }

    public static void bacHai() {
        System.out.println("Giải phương trình bậc hai có dạng : a*x^2+b*x+c = d ");
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        float a = sc.nextFloat();
        System.out.print("b = ");
        float b = sc.nextFloat();
        System.out.print("c = ");
        float c = sc.nextFloat();
        System.out.print("d = ");
        float d = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (d == c) System.out.println("Phương trình vô số nghiệm !");
                else System.out.println("Phương trình vô nghiệm ");
            } else {
                float x = (d - c) / b;
                System.out.println("Nghiệm của phương  trình x= " + x);
            }
        } else {
            double denta = b * b - 4 * a * c;
            System.out.println("denta=" + denta);
            if (denta < 0) System.out.println("Phương trình vô nghiệm ");
            if (denta == 0) {
                float x1 = -b / (float) (2 * a);
                System.out.println("Phương trình có nghiệm kép x1=x2= " + x1);
            }
            if (denta > 0) {
                float x1 = (-b + (int) Math.sqrt(denta)) / (float) (2 * a);
                float x2 = (-b - (int) Math.sqrt(denta)) / (float) (2 * a);
                System.out.println("2 nghiệm của  phương trình là: x1=" + x1 + "và x2= " + x2);

            }

        }

    }
}
