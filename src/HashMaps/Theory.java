package HashMaps;

import java.util.HashMap;
import java.util.HashSet;

public class Theory {
    //hashmap searches the element in constant amount of time

    /*
    1.we need all elements as the positive numbers->hashcode function
    2.hashcode will be very large->reduce it
    n=number of keys in a table
    m=size of table
    load factor=a=n/m=expected number of keys per slot
     */

    /*
    simple uniform hashing:
    assumption:every key is equally likely to be hashed to any slot in the table independent of where previous keys are hashed
     */
    /*
    Hash functions:
    1)division method:
    h(k)=k%m
    m=prime number but not too close to power of 2 or 10

    2)multiplication method:
    h(k)=[(a*k)%2^m]>>(w-r)
    a=random number
    w=number of bits in k
    m=2^r

    a is odd & 2^w-1<a<2^w and a is not too close to 2^w-1 or 2^w
     */

    /*
    universal hashing:
    h(k)=[(ak+b)%p]%m
    a&b are random from 0 to p-1

    p[h(k1)==h(k2)]=1/m
     */

    /*
     size of table:
     m=0(n) all time
     small size->slow big->waste

     idea:start small and grow
    */

    /*
    open addressing:
    only one item per slot=>m>=n
    probe->try->if the slot is full look for other index

    probing strategies:
    1)linear probing:
    h(k,i)=(h(k)+i)%m

    2)double hashing:
    h(k,i)=(h1(k)+i*h2(k))%m
    if h2(k) is relative prime to m for all k
    h1(k)+i*h2(k)%m=h1(k)+j*h2(k)%m
    m divides (i-j)
     */
    /*
    uniform hashing assumption:
    every key is equally likely to have m! permutations
    cost of next operation<=1/(1-a)
    a=n/m
     */
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("nithin",90);
        map.put("janu",91);
        System.out.println(map.get("nithin"));
        HashSet<Integer> set=new HashSet<>();
        set.add(56);
        set.add(67);
        set.add(65);
        System.out.println(set);
    }
}
