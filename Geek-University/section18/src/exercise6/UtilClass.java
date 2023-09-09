package exercise6;

import java.util.HashMap;
import java.util.Map;

public class UtilClass {
    
    public static Map<Character, Integer> initializeAlphabetMap() {
        return new HashMap<>() {{
            put('a', 0);
            put('á', 0);
            put('â', 0);
            put('ã', 0);
            put('b', 0);
            put('c', 0);
            put('d', 0);
            put('e', 0);
            put('é', 0);
            put('ê', 0);
            put('f', 0);
            put('g', 0);
            put('h', 0);
            put('i', 0);
            put('í', 0);
            put('j', 0);
            put('k', 0);
            put('l', 0);
            put('m', 0);
            put('n', 0);
            put('o', 0);
            put('ó', 0);
            put('ô', 0);
            put('õ', 0);
            put('p', 0);
            put('q', 0);
            put('r', 0);
            put('s', 0);
            put('t', 0);
            put('u', 0);
            put('x', 0);
            put('y', 0);
            put('z', 0);
        }};
    }
}
