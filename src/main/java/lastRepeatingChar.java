//Find the last repeating character in a string.
// Before I start, I'd like to clarify:

// Should character matching be case-sensitive?
// Should spaces and special characters be considered?
// If no character repeats, should I return null, -1, or print a message?

// Assuming:

// Case-sensitive
// Ignore spaces only if specified
// Return the last repeating character


import java.util.*; 
import java.lang.*;

class Main {
    public static void main(String[] args) {
        String str="abdccbd";
        
        HashMap <Character,Integer> map=new HashMap <> ();
        
        for(char ch:str.toCharArray()){
            if(map.containsKey(ch))  
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        for(int i=str.length()-1;i>=0;i--){
            if(map.get(str.charAt(i))>1){
                System.out.println("Last Repeating character is : "+str.charAt(i));
                break;
            }
        }
    }
}