package OOP;

public interface Nguoi {
    void lamMom();
    default void InraDanhSachSinhVien(){
        System.out.println("In ra danh sach SinhVien:");
    }
}
