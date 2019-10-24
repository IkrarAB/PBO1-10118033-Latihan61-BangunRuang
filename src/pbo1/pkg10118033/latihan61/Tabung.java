package pbo1.pkg10118033.latihan61;

public class Tabung implements BangunRuang {
    private double r,t;
    private final double phi = 3.14;

    public double getR() {
        return r;
    }

    public double getT() {
        return t;
    }

    public double getPhi() {
        return phi;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    @Override
    public double hitungVolume() {
        return phi*r*r*t;
    }
}