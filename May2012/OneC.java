import java.util.ArrayList;
import java.util.HashMap;

public class OneC {

    public static ArrayList<String> findSubstrings(String s, int len) {
        ArrayList<String> substrings = new ArrayList<String>();
        for(int i=0; i<s.length() - (len - 1); i++){
        	substrings.add(s.substring(i, i + len));
        }
        return substrings;
    }

    public static void increment(HashMap<String, Integer> map, String s) {
        Integer count = map.get(s);
        if(count == null){
        	map.put(s, 1);
        }
        else{
        	map.put(s, count + 1);
        }
    }
    
    public static HashMap<String, Integer> findStringCounts(String s) {
        HashMap<String, Integer> freq = new HashMap<String, Integer>();
        ArrayList<String> substrings = findSubstrings(s, 3);
        for(String sub : substrings){
        	increment(freq ,sub);
        }
        return freq;
    }
    
}
