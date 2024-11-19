package Functions.Theory;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,2,3,4,5};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArray(int[] arr){
        arr[0]=6; //if you make the change to the object via this reference variable, same object will be changed
    }
}
