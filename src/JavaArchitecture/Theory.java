package JavaArchitecture;

public class Theory {
    public static void main(String[] args) {
        System.out.println("This file contains the theory of java architecture");
        //.java file
        /*
        .java file(human readable)
        -this is the source code
         */
        /*
        | compiler(entire file)
        v
         */
        //.class file
        /*
        .class file(byte code)
        -this code will not directly run on a system
        -we need JVM to run this
        -reason why java is platform independent
        --------------------
        MORE ABOUT PLATFORM INDEPENDENT
        -it means that byte code run on all operating systems
        -we need to convert source code to machine code so computer can understand
        -compiler helps in doing this by turning it into executable code
        -this executable code is a set of instructions for the computer
        -after compiling c/c++ code we get .exe file which is platform dependent
        -in java we get bytecode,JVM converts this to machine code
        -Java is platform independent but JVM is platform dependent
         */
        //JDK
        /*
        -provides environment to develop and run the java program
        -it is a package that includes:
        1.development tools -to provide an environment to develop your program
        2.JRE-to execute your program
        3.a compiler-javac
        4.archiver-jar
        5.docs generator -javadoc
        6.interpreter/loader
         */
        //JRE
        /*
        -it is an installation package that provides environment to only run the program
        -it consists of:
        1.deployment technologies
        2.user interface tools
        3.integration libraries
        4.base libraries
        5.JVM
        -after we get the .class file,the next things happen at runtime
        1.class loader loads all classes needed to execute the program
        2.JVM sends code to byte code verifier to check the format of code
         */
    }
}
