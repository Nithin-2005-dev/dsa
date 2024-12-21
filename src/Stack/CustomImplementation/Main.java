package Stack.CustomImplementation;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack stack=new Stack(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
    }
}
