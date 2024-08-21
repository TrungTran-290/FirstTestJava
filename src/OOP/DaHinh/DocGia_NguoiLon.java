package OOP.DaHinh;

import java.util.Scanner;

public class DocGia_NguoiLon extends DocGia {
    private String so_CCCD;

    public DocGia_NguoiLon() {
        this.setGia(10000);
    }

    public String getSo_CCCD() {
        return so_CCCD;
    }

    public void setSo_CCCD(String so_CCCD) {
        this.so_CCCD = so_CCCD;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap CCCD: ");
        Scanner scanner = new Scanner(System.in);
        this.so_CCCD = scanner.nextLine();
        super.nhap();
    }
    @Override
    public void xuat(){
        System.out.println("So_CCCD"+ so_CCCD);
        super.xuat();
    }

    @Override
    public long tinhtien() {
        return getGia()*getSoThang();
    }
}
