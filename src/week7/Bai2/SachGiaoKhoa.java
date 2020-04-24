package week7.Bai2;

import week7.Bai2.Sach;

public class SachGiaoKhoa extends Sach {
    private int tinhTrang;//mới thì nhập 1, cũ nhập 0;

    public SachGiaoKhoa(String maSach, String tieuDe, String ngayNhap, String nhaXuatBan, double donGia, double soLuong, int tinhTrang) {
        super(maSach, tieuDe, ngayNhap, nhaXuatBan, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }
    public SachGiaoKhoa(){
        super();
        this.tinhTrang=1;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    protected void nhap() {
        super.nhap();
        System.out.println("Tình trạng( nếu mới thì nhập 1-- cũ thì nhập 0):");
        setTinhTrang(sc.nextInt());
    }

//    @Override
//    public double thanhTien() {
//        if (tinhTrang==0) thanhTien=soLuong*donGia*0.5;
//        else thanhTien=soLuong*donGia;
//        return thanhTien;
//    }

    @Override
    public String toString() {
        return "SachGiaoKhoa:" +super.toString()+
                ",tinhTrang=" + tinhTrang +'\''
               // ",thanhTien=" + thanhTien
                ;
    }
}
