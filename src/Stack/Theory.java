package Stack;

import java.util.Stack;

public class Theory {
     //it contains on push and pop methods
    //we can't remove or insert the elements in between
    //the one which is first inserted will be removed last and vice versa
     public static void main(String[] args) {
         Stack<Integer> stack=new Stack<>();
         stack.push(10);
         stack.push(30);
         stack.push(50);
         stack.push(40);
         System.out.println(stack);
         System.out.println(stack.pop());
         System.out.println(stack);
     }
}
