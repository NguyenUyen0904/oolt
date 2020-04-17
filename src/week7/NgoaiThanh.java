package week7;

public class NgoaiThanh extends ChuyenXe{
    private String noiDen;
    private double soNgay;

    public NgoaiThanh(String maCX, String tenTX, String soX, double doanhThu, String noiDen, double soNgay) {
        super(maCX, tenTX, soX, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public double getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(double soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Noi den ");
        setNoiDen(sc.nextLine());
    }
}
