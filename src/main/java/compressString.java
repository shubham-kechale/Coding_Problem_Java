// Problem Statement
//Compress a string using character counts
//        Input  : "aaabbccdd"
//        Output : "a3b2c2d2"
//        Input  : "abc"
//        Output : "abc"

import java.util.LinkedHashMap;

public class compressString {
    public static void main(String[] args) {
        String str="abbbcc";

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for (char ch:str.toCharArray()){
                if (map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else
                    map.put(ch,1);
        }
        for (char ch:map.keySet()){
            if (map.get(ch)==1)
                System.out.print(ch);
            else
            System.out.print(ch+""+map.get(ch));
        }
    }
}
