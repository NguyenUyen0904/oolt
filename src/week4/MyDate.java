package week4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
    private int date, month, year;

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(String dateName) {

    }

    public void setMonth(String monthName) {

    }

    public void setYear(String yearName) {

    }

    public  void print() {
        System.out.println("Current Date : " + java.time.LocalDate.now());
    }

    public  void print( String format) {
        SimpleDateFormat formatter;
        formatter = new SimpleDateFormat(format);
        Date date1 = new Date();
        date1.setDate(date);
        date1.setMonth(month-1);
        date1.setYear(year-1900);

        System.out.println("Date format:" + formatter.format(date1));
    }

}
