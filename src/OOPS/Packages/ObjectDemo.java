package OOPS.Packages;

public class ObjectDemo {
    public ObjectDemo() {
        super();
    }
    //it gives the number representation of object
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    //used to compare objects
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //it gives string representation
    @Override
    public String toString() {
        return super.toString();
    }
    //it calls when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
