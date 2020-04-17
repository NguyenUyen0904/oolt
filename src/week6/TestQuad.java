package week6;

public class TestQuad {
    public static void main(String[] args) {
        //Goi ham khoi tao khong tham so
        Quadrangle q1 = new Quadrangle();

        q1.hienThi();

        Point p1 = new Point(0, 2);
        Point p2 = new Point(0, 3);
        Point p3 = new Point(4, 3);
        Point p4 = new Point(2, 2);

        //Goi ham khoi tao 4 tham so
        Quadrangle q2 = new Quadrangle(p1, p2, p3, p4);
        q2.hienThi();

        Quadrangle q3 = new Quadrangle();
        q3.nhap();
        q3.hienThi();
    }

}
