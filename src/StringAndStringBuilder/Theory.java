package StringAndStringBuilder;

import java.util.ArrayList;

public class Theory {
    public static void main(String[] args) {
        String name="nithin";
        //strings are store in string pool inside heap
        //strings are immutable in java
        String name1="nithin";
//        System.out.println(name1==name);
        //above one gives true because both the strings are point to the same object
        name1="nitin";
//        System.out.println(name1==name);
        //above one gives false because name1 is now pointing to different object
        //== compares addresses
        //whereas .equals() compares objects
        //new object of same value can be created with new keyword
        String name2=new String("nithin");
//        System.out.println(name==name2);
        //above one gives false because new address is created for name2
//        System.out.println(name.equals(name2));
        //above one gives true because it compares only objects

        //----//
        //formated strings
        float a=12.12345f;
//        System.out.printf("%.2f",a);
        //if we are keep adding to the string then the new strings will be created everytime
        //it can be optimized with string builder
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        System.out.println(builder);
    }

}
