package HashMaps;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash{
    private Entity[] entities;
    public MapUsingHash(){
entities=new Entity[100];
    }
    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key,value);
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            return  entities[hash].value;
        }
        return null;
    }
    public void remove(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null && entities[hash].key.equals(key)){
            entities[hash]=null;
        }
    }
    private class Entity{
        String key;
        String value;
        public Entity(String key,String value){
            this.key=key;
            this.value=value;
        }
    }
}
public class Main {
    public static void main(String[] args) {
//        System.out.println("nithin".hashCode());
//        System.out.println("nithin".hashCode());
        HashMap<String, Integer> map=new HashMap<>();
        map.put("nithin",10);
        map.put("janu",20);
        map.put("janu",30);
        System.out.println(map.get("janu"));
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
    }
}
