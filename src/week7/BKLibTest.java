package week7;

import java.util.Scanner;

public class BKLibTest {
    public static void main(String[] args)
    {
        int x;
        Scanner a = new Scanner(System.in);
        ListBook listSach = new ListBook();
        do
        {
            System.out.println("\n\t-----------------------------------");
            System.out.println("\t0. Exit");
            System.out.println("\t1. Nhập thông tin sách ");
            System.out.println("\t2. Hiển thị các loại sách");
            System.out.println("\t3. Tổng thành tiền của từng loại");
            System.out.println("\t4. Trung bình cộng đơn giá của cách sách tham khảo");
            System.out.println("\t3. Xuất ra các sách giáo khoa theo tên nhà xuất bản");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            x = a.nextInt();
            System.out.println("------>>");
            switch(x)
            {
                case 1:
                    int y;
                    Scanner b = new Scanner(System.in);
                    do
                    {
                        System.out.println("\n\t-----------------------------------");
                        System.out.println("\t0. Exit");
                        System.out.println("\t1.Nhập thông tin sách giáo khoa ");
                        System.out.println("\t2.Nhập thông tin sách tham khảo ");
                        System.out.println("\t3.Nhập thông tin sách ngoại văn ");
                        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        y = b.nextInt();
                        System.out.println("------>>");
                        switch(y)
                        {
                            case 1:
                                listSach.listBooks(1);
                                break;
                            case 2:
                                listSach.listBooks(2);
                                break;
                            case 3:
                                listSach.listBooks(3);
                                break;
                        }
                    } while(y!=0);
                    break;
                case 2:
                    listSach.hienThi();
                    break;
                case 3:
                    break;
            }
        } while(x!=0);

    }

}
