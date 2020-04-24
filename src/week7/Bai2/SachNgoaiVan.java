package week7.Bai2;

import week7.Bai2.Sach;

public class SachNgoaiVan extends Sach {
    private String ngonNgu;

    public SachNgoaiVan(String maSach, String tieuDe, String ngayNhap, String nhaXuatBan, double donGia, double soLuong, String ngonNgu) {
        super(maSach, tieuDe, ngayNhap, nhaXuatBan, donGia, soLuong);
        this.ngonNgu = ngonNgu;
    }

    public SachNgoaiVan() {
        super();
        this.ngonNgu = "";
    }

    public String getNgonNgu() {
        return ngonNgu;
    }

    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }

    @Override
    protected void nhap() {
        super.nhap();
        System.out.println("Nhập ngôn ngữ :");
        setNgonNgu(sc.next());
    }


    @Override
    public String toString() {
        return "SachNgoaiVan:  " + super.toString() +
                ",ngonNgu='" + ngonNgu + '\'' +
                ",thanhTien=" + (soLuong * donGia * 1.2)
                ;
    }
}
