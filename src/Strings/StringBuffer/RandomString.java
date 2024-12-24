package Strings.StringBuffer;

public class RandomString {
    static String generate(int size){
        char r;
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < size; i++) {
            r= (char)(97+(int)(Math.random()*26));
            str.append(r);
        }
        return str.toString();
    }
}
