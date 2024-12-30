package HashMaps.Problems;

public class KarpRabinAlgo {
    //karp-rabin algorithm is used to search the substring in a main string in linear time
    /*
    let's take the strings
    a="app"
    b="we are making app for poor people"
    it compares the hash value of string a in b
    h(a)=hb[i:i+len(a)]
     */
    /*
        if(h(a)==hb[i:i+len(a)])
        may be->found a match->check every character O(a)
        if not:
        prob=1/len(a)

        ->expected cost per i(index)=O(1)
        time=O(len(a)+len(b)*cost of hash function)
     */
   private final int PRIME=101;
   private long calculateHash(String str){
       long hash=0;
       for (int i = 0; i < str.length(); i++) {
           hash= (long) (hash+str.charAt(i)*Math.pow(PRIME,i));
       }
       return hash;
   }
   private long updateHash(long prevHash,char oldChar,char newChar,int pattenLength){
       long newHash=(prevHash-oldChar)/PRIME;
       newHash= (long) (newHash+newChar*Math.pow(PRIME,pattenLength-1));
       return newHash;
   }
   public void search(String text,String pattern){
       int patternLength=pattern.length();
       long pa;
   }
}
