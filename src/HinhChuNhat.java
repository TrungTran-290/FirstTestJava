public class HinhChuNhat {
    public float dai;
    public float rong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(float d, float r) {
        this.dai = d;
        this.rong = r;
    }

    public float chuvi() {
        return (this.dai + this.rong) * 2;
    }

    public float dientich() {
        return (this.dai * this.rong);
    }
}