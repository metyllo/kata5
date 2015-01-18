package kata5;

import java.util.HashMap;

public class Histogram<T> extends HashMap<T, Integer> {

    @Override
    public Integer get(Object key) {
        return getFrequency((T) key);
    }
 
    private int getFrequency(T key){
        if(containsKey(key))
            return super.get(key);
        return 0;
    }
    
}
