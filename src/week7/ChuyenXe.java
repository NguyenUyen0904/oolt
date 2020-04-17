package week7;

import java.util.Scanner;

public abstract class ChuyenXe {
    protected String MaCX, TenTX, SoX;
    protected double doanhThu;

    public ChuyenXe(String maCX, String tenTX, String soX, double doanhThu) {
        MaCX = maCX;
        TenTX = tenTX;
        SoX = soX;
        this.doanhThu = doanhThu;
    }

    public String getMaCX() {
        return MaCX;
    }

    public void setMaCX(String maCX) {
        MaCX = maCX;
    }

    public String getTenTX() {
        return TenTX;
    }

    public void setTenTX(String tenTX) {
        TenTX = tenTX;
    }

    public String getSoX() {
        return SoX;
    }

    public void setSoX(String soX) {
        SoX = soX;
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
        return "ChuyenXe{" +
                "MaCX='" + MaCX + '\'' +
                ", TenTX='" + TenTX + '\'' +
                ", SoX='" + SoX + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }
}

