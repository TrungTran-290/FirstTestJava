import OOP.DaHinh.DanhSach;
import OOP.DaHinh.DocGia;
import OOP.DaHinh.DocGia_NguoiLon;
import OOP.DaHinh.DocGia_TreEm;
import OOP.SinhVien;
import OOP.SinhVienNN;
import OOP.SinhVienVN;

import java.sql.SQLOutput;

public class MainNew {

    public static void main(String[] args){
        SinhVien sinhVien = new SinhVien();
        SinhVienVN sinhVienVN = new SinhVienVN();
        SinhVienNN sinhVienNN = new SinhVienNN();
        sinhVien.setName("LE MEO");
        System.out.println("TEN: "+ sinhVien.name);
        SinhVien sinhVien1 = new SinhVien("LE NAI", 9,9);
        System.out.println("Thong Tin Sinh Vien: "+sinhVien1.name + " "+ sinhVien1.toan + " "+ sinhVien1.van);
        System.out.println("DTB: "+ sinhVien1.dtb());
        System.out.println("DTB: "+ sinhVien.dtb());
        System.out.println("DTB: "+ sinhVien1.dtb(sinhVien,sinhVien1));
        System.out.println(sinhVien1.toString());
        sinhVienVN.setTriet(3);
        System.out.println("Triet: "+ sinhVienVN.getTriet());
//        System.out.println("Nguoi NN: " sinhVienNN.lamMom());
        sinhVienNN.lamMom();
        sinhVienNN.InraDanhSachSinhVien();


//        DocGia docGiaNL = new DocGia_NguoiLon();
//        docGiaNL.nhap();
//        docGiaNL.xuat();
//        System.out.println("Tong Tien: "+ docGiaNL.tinhtien());
//        DocGia docGiaTE = new DocGia_TreEm();
//        docGiaTE.nhap();
//        docGiaTE.xuat();
        DanhSach ds = new DanhSach();
        ds.nhap();
        ds.xuat();
        System.out.println("Tong Tien: "+ ds.tinhtien());

    }

}
