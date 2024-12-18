package OOPS.Introduction.Static;

public class SingleTonClass {
    private SingleTonClass(){

    }
    private static SingleTonClass instance;
    public static SingleTonClass getInstance(){
        //check whether 1 obj is created or not
        if(instance==null){
            instance=new SingleTonClass();
        }
        return instance;
    }
}
