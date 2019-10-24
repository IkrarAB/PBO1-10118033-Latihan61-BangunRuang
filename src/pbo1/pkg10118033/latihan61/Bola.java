package pbo1.pkg10118033.latihan61;

public class Bola implements BangunRuang{
    private double r;
    private final double phi = 3.14;

    public double getR() {
        return r;
    }

    public double getPhi() {
        return phi;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    @Override
    public double hitungVolume() {
        return (4*phi*r*r*r)/3;
    }
}