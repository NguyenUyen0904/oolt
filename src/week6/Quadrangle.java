package week6;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Quadrangle {
    private Point p1, p2, p3, p4;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    public Point getP4() {
        return p4;
    }

    public void setP4(Point p4) {
        this.p4 = p4;
    }

    public Quadrangle() {
        setP1(new Point("A", 0, 0));
        setP2(new Point("B", 0, 1));
        setP3(new Point("C", 1, 1));
        setP4(new Point("D", 1, 0));
    }

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public void nhap() {
        Point[] arr = new Point[4];
        for (int i = 0; i < 4; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập điểm thứ " + (i + 1));
            String name = sc.nextLine();
            Float hoanh = sc.nextFloat();
            Float tung = sc.nextFloat();
            arr[i] = new Point(name, hoanh, tung);
        }
        setP1(arr[0]);
        setP2(arr[1]);
        setP3(arr[2]);
        setP4(arr[3]);
    }

    public void hienThi() {
        //  DecimalFormat decimalFormat = new DecimalFormat("#.#");
        System.out.print(p1.getName() + p2.getName() + p3.getName() + p4.getName() + ":");
//        System.out.print(p1.getName() + "(" + decimalFormat.format(p1.getX()) + "," + decimalFormat.format(p1.getY())+")"+",");
//        System.out.print(p2.getName() + "(" + decimalFormat.format(p2.getX()) + "," + decimalFormat.format(p2.getY())+")"+",");
//        System.out.print(p3.getName() + "(" + decimalFormat.format(p3.getX()) + "," + decimalFormat.format(p3.getY())+")"+",");
//        System.out.println(p4.getName() + "(" + decimalFormat.format(p4.getX()) + "," + decimalFormat.format(p4.getY())+")");
        System.out.println(p1 + ", " + p2 + ", " + p3 + ", " + p4);

    }
    public String getName() {
        return "Tu giac";
    }
    public abstract double getArea();

}
