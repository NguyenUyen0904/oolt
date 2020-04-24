package week7.Bai2;

import java.util.Scanner;

public abstract class Sach {
    protected String maSach, tieuDe, ngayNhap, nhaXuatBan;
    protected double donGia, soLuong;

    //protected double thanhTien;
    public Sach(String maSach, String tieuDe, String ngayNhap, String nhaXuatBan, double donGia, double soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.ngayNhap = ngayNhap;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
        //  this.thanhTien=thanhTien;
    }

    public Sach() {
        this.maSach = "";
        this.tieuDe = "";
        this.ngayNhap = "";
        this.nhaXuatBan = "";
        this.donGia = 0;
        this.soLuong = 0;
        // this.thanhTien=0;
    }

//    public double getThanhTien() {
//
//        return thanhTien;
//    }
//
//    public void setThanhTien(double thanhTien) {
//        this.thanhTien = thanhTien;
//    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    Scanner sc = new Scanner(System.in);

    protected void nhap() {
        System.out.println("Nhập mã số sách:");
        setMaSach(sc.nextLine());
        System.out.println("Nhập tiêu đề: ");
        setTieuDe(sc.nextLine());
        System.out.println("Nhập ngày nhập( theo kiểu dd/mm/yyyy:");
        setNgayNhap(sc.nextLine());
        System.out.println("Đơn giá:");
        setDonGia(sc.nextDouble());
        System.out.println("Nhập số lượng:");
        setSoLuong(sc.nextDouble());
        System.out.println("Nhập nhà xuất bản: ");
        setNhaXuatBan(sc.nextLine());
    }
    //public abstract double thanhTien();

    @Override
    public String toString() {
        return "maSach='" + maSach + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong
                ;
    }
}
//Cần hỏi anh Huy tại sao lỗi khi nhập nhà xuất bản. Phương thức Thành tiền nên xử lí sao.
