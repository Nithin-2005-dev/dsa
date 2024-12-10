package Recursion;

public class Theory {
    /*
    How to understand and approach a problem?
    1)identify if you can break down the problem into smaller problem
    2)write the recurrence relation if needed
    3)draw the tree
    4)about the tree;
        ->see the flow of functions ,how they are getting in stack
        ->identify and focus left tree calls and right tree calls
        ->draw the tree and pointers again and again using pen and paper
        ->use a debugger to see the flow
    5)see how the values are returned at each step.see where the function calls will come out of and ,you will come out of the main function and what type of values
     */
    /*
    types of recurrence relations:-
    1)linear (reducing linearly)
    2)divide and conquer (reduced by a factor)
     */
    public static void main(String[] args) {
        //write a function that prints hello world and print it in 5 times without modifying the function
//        message();
        //write a function that takesa number and prints it
        //print first 5 numbers :1 2 3 4 5
//        printNum(5);

        /*
        how function calls work in languages:-
        ->while the function is not finished executing it will remain in stack
        ->when a function finishing executing it is removed from stack and the flow of program is restored from where it started.
        ->base condition in recursion:condition where the recursion will stop making new calls
        ->no base condition:function calls will keep happening,stack will be filled again and again-memory of computer will exceed the limit-stack overflow error
         */
        //using recursion
        printNumRec(5);
        /*
        why recursion?
        *it helps us in solving bigger complex problems in a simple way.
        *we can convert recursion solution into iteration and vice versa.
        *space complexity is not constant.
         */
    }
    static void printNumRec(int n){
        if(n==0) return;
        System.out.println(n);
        //this is called tail-recursion
        printNumRec(n-1);
    }
    static void printNum(int n){
        System.out.println(n);
        printNum1(n-1);
    }
    static void printNum1(int n){
        System.out.println(n);
        printNum2(n-1);
    }static void printNum2(int n){
        System.out.println(n);
        printNum3(n-1);
    }static void printNum3(int n){
        System.out.println(n);
        printNum4(n-1);
    }static void printNum4(int n){
        System.out.println(n);
    }

    static void message(){
        System.out.println("Hello world");
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }static void message2(){
        System.out.println("Hello world");
        message3();
    }static void message3(){
        System.out.println("Hello world");
        message4();
    }static void message4(){
        System.out.println("Hello world");
    }
}
