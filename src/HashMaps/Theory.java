package HashMaps;

public class Theory {
    /*
    ->it is used to search the element in a constant time.
     */
    /*
    how hashmap works:
    ->let's take the array we need to find the index of element in constant time.
    ->we use hashcode where it gives the number after taking the element using some formula.
    ->the hashcode can be very large string.we need to reduce it.it is known as hashing.
    ->reduce all elements in table to a size m.
    collisions:getting the same number after the reducing.
    ways to deal with collision:
    1)chaining
    2)open addressing

    chaining:
    ->let's say there is an array.
    ->At every element of the array let's say there is a linked lists.
    ->add the elements with same index in the same linked list.
    ->we try our best to not store elements in same linked list.
    Assumption:
    ->every key is equally likely to be hashed to any slot in the table independent to where the previous keys are hashed.
    n=number of keys in table
    m=size of table
    load factor=n/m=expected key per slot

    hash functions:
    1)division method:h(k)=k%m
    m=prime number(not to close to power of 2 or 10)
    2)multiplication method:h(k)=[(a.k)%2^w]>>(w-r)
    a=random number
    w=number of bits in k
    m=2^r
    a is odd & 2^w-1 <a<2^w
    a is not too close to 2^w-1 or 2^w
     */
    /*
    universal hashing:
    h(k)=[(a*k+b)%p]%m
    a&b are random numbers
    p is large prime number

    p[h(k1)=h(k2)]=1/m
     */
    /*
    size of table:
    m=0(n)
    m->small->slow
    m->big->wasting resources
    idea:start small and grow
     */
    /*
    open addressing:
    one item per slot->m>=n
    probe->trying to find next possible empty space

    probing strategies:
    1)linear probing:h(k,i)=(h(k)+i)%m
    2)double hashing:h(k,i)=(h1(k)+i*h2(k))%m
    if h2(k) is relative prime to m for all k
     */
    /*
    uniform hashing assumption:
    ->every key is equally likely to have m! permutations
     */
    /*
    when to use which?
    OA->better cache performance
    chaining->less sensitive to hash functions
     */
}