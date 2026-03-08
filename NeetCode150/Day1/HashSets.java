import java.util.HashSet;
import java.util.Iterator;

public class HashSets{
    public static void main(String[] args){
        HashSet<Integer>set = new HashSet<>(); // unique
        set.add(1);
        set.add(2); 
        set.add(3); 
        set.add(4); 
        set.add(5); 
        set.remove(1);
        System.out.println(set.contains(1));

        // Iterator 
        Iterator it = set.iterator();
        while(it.hasNext()){ // return true
            System.out.println(it.next());
        }
    }
}