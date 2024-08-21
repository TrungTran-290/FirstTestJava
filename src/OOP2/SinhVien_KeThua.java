package OOP2;

import java.util.Scanner;

public class SinhVien_KeThua extends SinhVien{
    private double socialcredit;

    public SinhVien_KeThua() {
    }

    public double getSocialcredit() {
        return socialcredit;
    }

    public void setSocialcredit(float socialcredit) {
        this.socialcredit = socialcredit;
    }
    public void nhap(){
        super.nhap();
        System.out.println("Nhap SOcial Credit:");
        java.util.Scanner scanner = new Scanner(System.in);
        this.socialcredit = scanner.nextInt();
    }
    public void xuat(){
        super.xuat();
        System.out.println("Socail Credit la:" +this.socialcredit);
    }

}
