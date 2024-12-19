package OOPS.Principles.Inheritance;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double s, double weight) {
        super(s);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(Box o, double weight) {
        super(o);
        this.weight = weight;
    }
}
