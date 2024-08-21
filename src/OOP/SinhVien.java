package OOP;

public class SinhVien {
    public String name;
    public float toan;
    public float van;
    public SinhVien() {
    }
    public SinhVien(String name, float toan, float van) {
        this.name = name;
        this.toan = toan;
        this.van = van;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }
    public float dtb (){
       return (this.toan + this.van)/2;
    }
    public float dtb (SinhVien a,SinhVien b){
        return (this.dtb()  + a.dtb() + b.dtb())/3;
    }
    public void xuat(){
        System.out.println("Thong Tin Sinh Vien: "+this.name + " "+ this.toan + " "+ this.van);
    }
    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", toan=" + toan +
                ", van=" + van +
                '}';
    }
}
