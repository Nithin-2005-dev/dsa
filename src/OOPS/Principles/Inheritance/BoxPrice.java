package OOPS.Principles.Inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(double cost) {
        this.cost = cost;
    }
    public BoxPrice() {
        super();
        this.cost = -1;
    }
    public BoxPrice(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    public BoxPrice(double s, double weight, double cost) {
        super(s, weight);
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(Box o, double weight, double cost) {
        super(o, weight);
        this.cost = cost;
    }
}
