package OOPS.Comparing;

public class Main {
    public static void main(String[] args) {
        Student nithin=new Student(73,84.2f);
        Student janu=new Student(19,85f);
        if(nithin.compareTo(janu)>0){
            System.out.println("nithin got high marks");
        }else{
            System.out.println("janu got high marks");
        }
    }
}
