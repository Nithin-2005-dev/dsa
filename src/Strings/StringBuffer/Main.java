package Strings.StringBuffer;

public class Main {
    /*
    String Buffer:mutable sequence of characters

    Advantages:
    1)mutable
    2)more efficient
    3)thread safe->makes little slower
     */
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb=new StringBuffer();
        sb.append("WeMakeDevs");
        //constructor 2
        StringBuffer sb2=new StringBuffer("nithin");
        //constructor 3
        StringBuffer sb3=new StringBuffer(30);
        String str=sb.toString();
//        System.out.println(sb);
        System.out.println(RandomString.generate(10));
    }
}
