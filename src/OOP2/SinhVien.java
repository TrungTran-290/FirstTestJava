package OOP2;

import java.util.Scanner;

public class SinhVien implements Nguoi {
    private String ten;
    private int tuoi;
    private int diem;
    private int diem2;

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, int diem, int diem2) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
        this.diem2 = diem2;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getDiem2() {
        return diem2;
    }

    public void setDiem2(int diem2) {
        this.diem2 = diem2;
    }
    public int dtb(){
        return (diem + diem2)/2;
    }
    public void nhap(){
        System.out.println("Nhap Ten");
        Scanner scanner = new Scanner(System.in);
        this.ten = scanner.nextLine();
        System.out.println("Nhap Tuoi");
        this.tuoi = scanner.nextInt();
        System.out.println("Nhap diem");
        this.diem = scanner.nextInt();
        System.out.println("Nhap diem2");
        this.diem2 = scanner.nextInt();
    }
    public void xuat(){
        System.out.println("Ten: " + ten + " " +"Tuoi: "+ tuoi);
    }
    public int trungbinhuser(SinhVien a, SinhVien b){
        return (this.dtb() + a.dtb() +b.dtb())/3;
    }

    @Override
    public void EarnScore() {

    }

    @Override
    public int LoseScore(int tuoi) {
        return Nguoi.super.LoseScore(tuoi);
    }
}
