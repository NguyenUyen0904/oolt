package week7;

public class NoiThanh extends ChuyenXe {
    private String soTuyen;
    private double soKm;

    public NoiThanh(String maCX, String tenTX, String soX, double doanhThu, String soTuyen, double soKm) {
        super(maCX, tenTX, soX, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    public NoiThanh() {
        super();
        this.soTuyen = "";
        this.soKm = 0;

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

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap so tuyen:");
        setSoTuyen(sc.next());
        System.out.println("So Km: ");
        setSoKm(sc.nextDouble());
    }

    @Override
    public String toString() {
        return "NoiThanh: " + super.toString() +
                "\nsoTuyen=" + soTuyen +
                "\nsoKm=" + soKm + "\nDoanh thu: " + doanhThu
                ;
    }
}
