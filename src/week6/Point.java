package week6;

import javax.swing.*;
import java.text.DecimalFormat;

public class Point {
    private String name;
    private float x, y;

    public Point(String name, float x, float y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.name = "A";
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void nhap() {
        String strName, strX, strY;

        strName = JOptionPane.showInputDialog(null,
                "Nhap ten diem: ", JOptionPane.INFORMATION_MESSAGE);
        setName(strName);

        strX = JOptionPane.showInputDialog(null,
                "Nhap hoanh do: ", JOptionPane.INFORMATION_MESSAGE);
        // dTung = Float.parseFloat(strTung);
        setX(Float.parseFloat(strX));

        strY = JOptionPane.showInputDialog(null,
                "Nhap tung do: ", JOptionPane.INFORMATION_MESSAGE);
        //dHoanh = Float.parseFloat(strHoanh);
        setY(Float.parseFloat(strY));
    }

    public void hienThi() {
        JOptionPane.showMessageDialog(null, "Point: " + name + "(" + x + "," + y + ")");
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        return name + "(" + decimalFormat.format(x) + "," + decimalFormat.format(y) + ")";
    }
}
