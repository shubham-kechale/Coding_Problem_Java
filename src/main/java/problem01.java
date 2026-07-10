// problem statement : 
//      Check if all ‘a’ come before 'b' in the string.
//          Input: “aaabb” → true
//          Input: “ababa” → false

import java.util.*;

class Main {
    public static void main(String[] args) {
        String str="aaabb";
        String str1="ababa";
        
        System.out.println(checkOrder(str));
        System.out.println(checkOrder(str1));
    }
    
    public static boolean checkOrder(String str){
        boolean foundB=false;
        str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            if( ch=='b')
                foundB=true;
            if(ch=='a' && foundB){
                return false;
            }
        }
        return true;
    }
}