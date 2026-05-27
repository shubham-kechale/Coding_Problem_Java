import java.util.Arrays;
import java.util.HashMap;

// Problem Statement
//Check whether two strings are anagrams
//        Ignore spaces and case sensitivity
//        Input:
//        "Listen"
//        "Silent"
//
//        Output:
//        Anagram
public class Anagram {
    public static void main(String[] args) {

        String str="Listen";
        String str1="Silent";

        if (isAnagram(str,str1)){
            System.out.println("Given Strings are anagram");
        }
        else
            System.out.println("Given Strings are not anagram");

    }
// 1st approach
//    public static boolean isAnagram(String str,String str1){
//        if (str.length()!=str1.length())
//            return  false;
//        else {
//            str=str.toLowerCase();
//            str1=str1.toLowerCase();
//            char [] ch=str.toCharArray();
//            char [] ch1=str1.toCharArray();
//            Arrays.sort(ch);
//            Arrays.sort(ch1);
//            for(int i=0;i<ch.length;i++) {
//                if (ch[i] != ch1[i])
//                    return false;
//            }
//            return true;
//        }
//    }

    // 2nd approach
    public static boolean isAnagram(String str,String str1){
        if (str.length()!=str1.length())
            return false;
        else {
            str=str.toLowerCase();
            str1=str1.toLowerCase();
            HashMap<Character,Integer> map=new HashMap<>();
            for (char ch:str.toCharArray()) {
                if (map.containsKey(ch))
                    map.put(ch, map.get(ch) + 1);
                else
                    map.put(ch, 1);
            }
            for (char ch1:str1.toCharArray())
                if (!map.containsKey(ch1))
                    return false;

            return true;
        }
    }
}
