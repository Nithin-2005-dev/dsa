package OOPS.ExceptionHandling;

public class Main {
    /*
    -)throwable class is inherited by Object class.
    -)throwable is parent of two classes:
    1)exceptions
    ->checked
    ->not checked
    2)errors
     */
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            String name="nithin";
            if(name.equals("nithin")){
                throw new MyExceptions("name is nithin");
            }
            System.out.println(divide(1,0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will always execute");
        }
    }
    static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("please do not divide by 0");
        }
        return a/b;
    }
}
