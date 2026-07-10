// problem statement : 
//  Given a string of digits, compare adjacent numbers and return the result using >, <, or =.

//           Input: “658488”
//           Output: “><>=<”

import java.util.*;

class Main {
    public static void main(String[] args) {
        String str= "658488";
        
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) > str.charAt(i+1))
                System.out.print(">");
            else if(str.charAt(i) < str.charAt(i+1) )
                System.out.print("<");
            else if(str.charAt(i)  == str.charAt(i+1))
                System.out.print("=");
        }
    }
}