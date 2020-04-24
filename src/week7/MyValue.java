package week7;

import java.util.Objects;

public class MyValue {
    private int number;

    public MyValue(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        MyValue oMyValue=(MyValue) obj;
        if(this.number==oMyValue.getNumber()) return true;
        else return false;
    }

    public static void main(String args[]) {
        MyValue mv1 = new MyValue(100);
        MyValue mv2 = new MyValue(100);
        System.out.println(mv1.equals(mv2));
        System.out.println(mv1==mv2);
    }
}
