package OOPS.Introduction.Static;
//outside class can't be static
public class InnerClasses {
    //inside class can be static
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("nithin");
        Test b=new Test("nithin");
    }
}
