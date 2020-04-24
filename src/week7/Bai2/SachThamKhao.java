package week7.Bai2;

import week7.Bai2.Sach;

public class SachThamKhao extends Sach {
    private String chuyenNganh;
    private double thue;
    private static double count = 0;

    public SachThamKhao(String maSach, String tieuDe, String ngayNhap, String nhaXuatBan, double donGia, double soLuong, String chuyenNganh, double thue) {
        super(maSach, tieuDe, ngayNhap, nhaXuatBan, donGia, soLuong);
        this.chuyenNganh = chuyenNganh;
        this.thue = thue;
        count++;
    }

    public SachThamKhao() {
        super();
        this.chuyenNganh = "";
        this.thue = 0;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    protected void nhap() {
        super.nhap();
        System.out.println("Nhập chuyên ngành:");
        setChuyenNganh(sc.nextLine());
        System.out.println("Thuế:");
        setThue(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "SachThamKhao: " + super.toString() +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", thue=" + thue + '\'' +
                ",thanhTien=" + (donGia * soLuong + thue)
                ;
    }
}
