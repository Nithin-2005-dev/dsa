package Strings.BigIntegerAndBigDecimal;

import java.math.BigInteger;

public class Main {
    /*
    storing large integers:
    -)BigInteger class in java->object->java.lang.Number->java.math.BigInteger
    -)it extends number class and implements comparable BigInteger
    Range:(-2^(Integer.MAX_VALUE) to 2^(Integer.MAX_VALUE))
     */
    /*
    BigDecimal:
    why we are not getting exact answer with float and double?
    ->because float & double are floating point number.
    stored as binary representation of fraction and power that's why they give small error(10^-19)


    -)but we get exact answer with big decimal.
    -)range:it contains a random precision int unscaled value and 32-bit int scale
    >=0-->scale=no.of digits right of decimal point
    else:unscaled value=10^-scale
     */
    public static void main(String[] args) {
        int a=33;
        int b=67;
        BigInteger A=BigInteger.valueOf(33);
        BigInteger B=BigInteger.valueOf(817913359);
        BigInteger C=new BigInteger("81791335939059234588");

        //constants
        BigInteger D=BigInteger.TEN;
        //addition
        BigInteger sum=A.add(C);
        BigInteger mul=B.multiply(C);
//        System.out.println(sum);
//        System.out.println(mul);
//        if(C.compareTo(B)>0){
//            System.out.println("c is bigger");
//        }
    }
}
