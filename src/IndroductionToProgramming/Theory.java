package IndroductionToProgramming;

public class Theory {
    public static void main(String[] args) {
        System.out.println("This file contains the theory of types of languages");
        //Types of languages
        /*1.procedural
            -specifies a series of well-structures steps and procedures to compose a program
            -contains a systematic order of statements,functions and commands to complete a task
         */
        /*
        2.functional
        -writing a program only in pure functions i.e never modify variables,but only create new ones as an output
        -used in situations where we have to perform lots of different operations on the same set of data,like ML.
        -first class functions?

        */
        /*
        Object oriented
        -revolves around objects
        -code+data=object
        -developed to make it easier to develop,debug,reverse and maintain software
         */
        //static and dynamic languages
        /*
        static
        -perform type checking at compile time
        -errors will show at compile time
        -declare datatype before you use it
        -more control
         */
        /*
        dynamic
        -perform type checking at runtime
        -error might not show till program is run
        -no need to declare datatype of variables
        -saves time in writing code but might give errors at runtime
         */
        //Types of memories
        /*
        1.stack
        2.heap


        a=10
        a-->reference variable
        10-->object

        a is storied in stack
        10 is storied in head

        a points 10

        1.more than one reference variables can point same object
        2.if any one of the reference variable change the object than original object will going to be changed.


        <object with no reference variable will be removed from the memory with the garbage collection hits/>
         */
    }
}
