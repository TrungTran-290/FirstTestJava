package OOP.DaHinh;

import java.util.Scanner;

public abstract class DocGia {
    private int soThang;
    private long gia;

    public DocGia() {
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public int getSoThang() {
        return soThang;
    }

    public void setSoThang(int soThang) {
        this.soThang = soThang;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Thang");
        this.soThang = scanner.nextInt();
    }
    public void xuat(){
        System.out.println("So thang"+ soThang +" " + gia);
    }
    abstract long tinhtien();
}
