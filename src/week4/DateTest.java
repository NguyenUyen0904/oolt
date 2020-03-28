package week4;

public class DateTest {
    public static void main(String args[]) {
        MyDate date1 = new MyDate(12, 8, 2020);
        MyDate date2 = new MyDate(20, 4, 2020);
        MyDate date3 = new MyDate(12, 6, 2020);
        System.out.println("Đây là hàm print cho ra thời điểm hiện tại");
        date1.print();
        System.out.println("Đây là hàm print cho ra thời gian chỉ định sẵn theo 1 kiểu fomart");
        date1.print("yyyy/MM/dd");
        date2.print("yyyy/MM/dd");
        MyDate[] dates = {date1, date2, date3};
        System.out.println("Đây là phần so sánh 2 ngày ");
        DateUtils.compareTo(date1,date2);
        System.out.println("Đây là phần sắp xếp các ngày ");
        DateUtils.sort(dates);

    }
}
