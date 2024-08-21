package OOP2.DaHinh;

public class ThuePhong {
    private float thang;
    private float gia;

    public ThuePhong() {
    }
    public ThuePhong(float gia, float thang) {
        this.gia = gia;
        this.thang = thang;
    }

    public float getThang() {
        return thang;
    }

    public void setThang(float thang) {
        this.thang = thang;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    public float tinhtong(){
        return this.gia*this.thang;
    }
}
