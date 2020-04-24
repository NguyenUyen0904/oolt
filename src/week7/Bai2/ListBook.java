package week7.Bai2;

public class ListBook {
    private static final int  MAX=100;
    private Sach[] Books = new Sach[MAX];
    private int countBook;
    private double sum1=0, sum2=0;
    public void listBooks(int temp)
    {
        if(countBook>MAX)
            System.out.println("Khong the them du lieu!");
        else
        {
            if(temp==1)
            {
                Books[countBook] = new SachGiaoKhoa();
                SachGiaoKhoa sgk= new SachGiaoKhoa();
                sgk.nhap();
                Books[countBook] =sgk;

            }
            if(temp==2)
            {
                Books[countBook] =new SachThamKhao();
                SachThamKhao stk = new SachThamKhao();
                stk.nhap();
                Books[countBook] =stk;
            }
            else
            {
                Books[countBook] =new SachNgoaiVan();
                SachNgoaiVan snv = new SachNgoaiVan();
                snv.nhap();
                Books[countBook] =snv;
            }
            countBook++;
        }
    }

    public void hienThi()
    {
        for(int i=0 ; i<countBook; i++)
        {
            System.out.println("------------/---------------/------------");
            System.out.println(Books[i].toString());
        }
        System.out.println("------------------------------------------");
    }


}
