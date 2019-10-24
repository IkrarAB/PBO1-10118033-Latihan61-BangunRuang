package pbo1.pkg10118033.latihan61;

public class Kerucut implements BangunRuang{
    private double r,t;
    private final double phi = 3.14;

    public double getR() {
        return r;
    }

    public double getT() {
        return t;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double hitungVolume() {
        return (1*phi*r*r*t)/3;
    }
}