package OOP.DaHinh;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSach {
    private List<DocGia> arr;

    public DanhSach() {
        this.arr = new ArrayList<>();
    }
    public void nhap(){
        int flag= 1;

        System.out.println("1 : Nguoi lon");
        System.out.println("2: Tre em ? ");
        System.out.println("3: So Te");
        System.out.println("4: Cut");

        System.out.println("*--======================--*");
        while(true){
            System.out.println("nhap so?:");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextInt();
            DocGia a = null;
            if (flag == 1) {
                 a = new DocGia_NguoiLon();
                a.nhap();
                arr.add(a);
            } else if (flag == 2 ) {
                 a = new DocGia_TreEm();
                a.nhap();
                arr.add(a);
            }else if (flag == 3 ) {
                System.out.println("So luong tre em duoi tang ham la:" + tong_reader_smol());
            }
            else if (flag == 4 ) {
                break;
            }

        }

    }
    public void xuat(){
        for(DocGia i: this.arr){
           i.xuat();
        }
    }
    public int tong_reader_smol(){
        int dem = 0;
        for (DocGia i: this.arr){
            if (i instanceof DocGia_TreEm){
                dem++;
            }
        }
        return dem;
    }
    public long tinhtien(){
        long tong = 0;
        for(DocGia i: this.arr){
            tong += i.tinhtien();
        }
        System.out.println("Tong Tien: "+ tong);
        return tong;
    }
}
