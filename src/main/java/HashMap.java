// HashMap.

import java.util.*;

class Main {
    public static void main(String[] args) {
        
        String str="aabcdde";
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char ch: str.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        System.out.println(map);
        
    // using keySet().
        for(char ch:map.keySet()){
            System.out.println(ch+" : "+map.get(ch));
        }
        
    // using values.    
        for(int i:map.values()){
            System.out.println(i);
        }
        
    // iterate using by entrySet 
        for(Map.Entry<Character,Integer> enterySet:map.entrySet()){
            System.out.println(enterySet.getKey()+" -> "+enterySet.getValue());
        }
    }
}