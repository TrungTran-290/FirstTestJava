package OOP;

public class SinhVienVN extends SinhVien {
    private float triet;

    public SinhVienVN(String name, float toan, float van, float triet) {
        super(name, toan, van);
        this.triet = triet;
    }

    public SinhVienVN() {
        super();
    }

    public float getTriet() {
        return triet;
    }

    public void setTriet(float triet) {
        this.triet = triet;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Triet: "+ triet);
    }
}
