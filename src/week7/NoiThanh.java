package week7;

public class NoiThanh extends ChuyenXe{
    private String soTuyen;
    private double soKm;

    public NoiThanh(String maCX, String tenTX, String soX, double doanhThu, String soTuyen, double soKm) {
        super(maCX, tenTX, soX, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
}
