import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
// Problem Statement
//  Count occurrences of each character in a string
//        Ignore spaces
//        Maintain insertion order
//        Input  : "selenium java"
//        Output :
//        s -> 1
//        e -> 2
//        l -> 1
//        ...

public class charOccurence {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str= sc.nextLine();
        String str="selenium java";

        // logic
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for (char ch: str.toCharArray()){
            if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else
                    map.put(ch,1);
        }
        System.out.println( map);
    }
}
