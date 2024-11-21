package arrays.Basics;
import arrays.Input.InputAnIntArray;
import java.util.Arrays;
import arrays.PrintAnArray.PrintArray;
public class Theory {
    public static void main(String[] args) {
        //Q:store a roll number
        int a=19;
        //Q:store a person's name
        String name="nithin";
        //Q:store 5 roll numbers
        int rno1=23;
        int rno2=99;
        int rno3=23;
        int rno4=99;
        int rno5=99;
        //syntax
        //datatype[] variable_name=new datatype[size]
        int[] nos; //declaration of array . nos is getting defined in the stack
        nos= new int[]{1, 2, 3, 4, 5}; //actually here object is being created in the memory(heap)
        //all the type of data in array should be same
        int[] arr=new int[5];//-->dynamic memory allocation
        //array objects are in heap
        //heap objects are not continues
        //so array objects in java may not be continues
        //arrays are 0 indexed
        //new used to create an object
        //integer array by default fills with zeros
        //null is a special literal
        //It can't be assign to primitives
        String[] arr1=new String[5];
        //Internal working of objects array
        PrintArray.printArray2D(InputAnIntArray.ArrayInput2D());
    }
}
