package week4;

public class Bai1b {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;// nếu thêm L(1000L) thì sẽ chạy ra kết quả đúng , do dữ liệu đang bị tràn
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }

}
