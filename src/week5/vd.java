package week5;

public class vd {
    public vd(int i) {
        System.out.print(1);
    }

    public vd (){
        this(10);
        System.out.print(2);
    }
    void vd(){
        vd(10);
        System.out.print(3);

    }
    void vd(int i){
        System.out.print(4);
    }

    public static void main (String[] args){
        new vd().vd();

    }
}
