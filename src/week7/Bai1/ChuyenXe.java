package week7.Bai1;

import java.util.Scanner;

public class ChuyenXe {
    protected String maCX, tenTX, soX;
    protected double doanhThu;

    public ChuyenXe(String maCX, String tenTX, String soX, double doanhThu) {
        this.maCX = maCX;
        this.tenTX = tenTX;
        this.soX = soX;
        this.doanhThu = doanhThu;
    }

    public ChuyenXe() {
        this.maCX = "";
        this.tenTX = "";
        this.soX = "";
        this.doanhThu = 0;

    }

    public String getMaCX() {
        return maCX;
    }

    public void setMaCX(String maCX) {
        this.maCX = maCX;
    }

    public String getTenTX() {
        return tenTX;
    }

    public void setTenTX(String tenTX) {
        this.tenTX = tenTX;
    }

    public String getSoX() {
        return soX;
    }

    public void setSoX(String soX) {
        this.soX = soX;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    Scanner sc = new Scanner(System.in);

    public void nhap() {
        System.out.println("Nhap ma so chuyen xe:");
        setMaCX(sc.nextLine());
        System.out.println("Ho ten tai xe: ");
        setTenTX(sc.nextLine());
        System.out.println("So xe:");
        setSoX(sc.nextLine());
        System.out.println("Doanh thu:");
        setDoanhThu(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "\nMaCX=" + maCX +
                "\nTenTX=" + tenTX +
                "\nSoX=" + soX
                ;
    }
}
