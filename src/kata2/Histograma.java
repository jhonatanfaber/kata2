package kata2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Histograma<T> {
    private final HashMap<T,Integer> map = new HashMap<>();

    public Integer get(Object o) {
        return map.get(o);
    }

    public Set<T> keySet() {
        return map.keySet();
    }
    
    public void increment(T key){
        map.put(key,map.containsKey(key)? map.get(key)+1: 1 );
        
    }
    
    
    
    
    
    
}
