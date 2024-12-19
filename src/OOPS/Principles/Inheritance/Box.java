package OOPS.Principles.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    public Box() {
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    public Box(double s){
        this.h=s;
        this.l=s;
        this.w=s;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    public Box(Box o){
        this.l=o.l;
        this.h=o.h;
        this.w=o.w;
    }
    public void info(){
        System.out.println("Running the box");
    }
}
