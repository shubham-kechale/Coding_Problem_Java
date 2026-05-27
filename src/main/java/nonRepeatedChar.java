
// Problem Statement
//Find the first non-repeated character in a string
//        Ignore spaces
//        Return null or special message if none exists
//        Input  : "aabbcdeff"
//        Output : c

import java.util.*;

public class nonRepeatedChar {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str= sc.nextLine();
        String str="aabbcdeffc";

        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }

        for(char ch:map.keySet()){
            if(map.get(ch)==1){
                System.out.println("First non-repeated character in string is : "+ch);
                break;
            }
        }


    }
}
