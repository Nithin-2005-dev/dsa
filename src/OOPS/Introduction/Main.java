package OOPS.Introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //create a data structure that stores 5 roll numbers
        int[] rolls=new int[5];
        //create a data structure that stores 5 names
        String[] names=new String[5];
        //create a data structure that stores data of 5 students which include roll number,name and marks
        Student[] students=new Student[5];
        //create a data structure that stores data of 1 student which include roll number,name and marks
        Student nithin; //declaration
        //class is a template whereas objects are instances of the class
        /*
        class->logical construct
        object->physical reality--It occupies space in memory
         */
        //new does the dynamic memory allocation
        nithin=new Student(73,"nithin",50f);//dynamically allocates memory and return reference to it
        //you can't add new variables in java in run time because it is statically typed language
        //constructor use to initalize the variable the vairiable while initialisation
        //constructor is a special type of function that runs when you create an abject and it allocates some variables
        System.out.println(nithin.rolls);
        nithin.greeting("janu");
        //these both are points to same object so changing of one object leads to change of others
        Student one=new Student();
        Student two=one;
        one.names="nithin";
        System.out.println(two.names);
        Student none;
        for (int i = 0; i < 1000000000; i++) {
            none=new Student();
        }
    }
}
//creating a class
//for every single student
class Student{
    //we need a way to add the values of the above
    //properties object by object
    //we need one word to access every object
    //it can be done with "this" keyword
    //here this will be replaced with actual object
    Student(int rolls,String names,float marks){
        this.rolls=rolls;
        this.names=names;
        this.marks=marks;
    }
    Student(){
        //this is how you call a constructor from another constructor
        this(13,"person",0f);
    }
    Student(Student other){
        this.rolls=other.rolls;
        this.names=other.names;
        this.marks=other.marks;
    }
    int rolls;
    String names;
    float marks;
    //by using this keyword you can reference to the object
    void greeting(String names){
        System.out.println("hello "+this.names);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
//FINAL KEYWORD
//when you use the final keyword, you can't modify it in future calls
//it's mandatory to initialize the final variable while declaring
//when a non-primitive is final,you cannot reassign it.

//GARBAGE COLLECTION
//it is called when the object don't have any reference

//FINALIZE METHOD
//it calls when the garbage collection hits