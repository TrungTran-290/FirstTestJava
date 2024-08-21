package OOP.DaHinh;

import java.util.Scanner;

public class DocGia_TreEm extends DocGia {
    private String nguoiBH;

    public DocGia_TreEm() {
        this.setGia(5000);
    }

    public String getNguoiBH() {
        return nguoiBH;
    }

    public void setNguoiBH(String nguoiBH) {
        this.nguoiBH = nguoiBH;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap NG Bao Ho");
        Scanner scanner = new Scanner(System.in);
        this.nguoiBH = scanner.nextLine();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println("Nguoi bao ho"+getNguoiBH());
        super.xuat();
    }

    @Override
    public long tinhtien() {
        return getGia()*getSoThang();
    }
}
