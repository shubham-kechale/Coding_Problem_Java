// Problem Statement
//Remove duplicate characters from a string
//        Preserve original order
//        Do NOT use Set
//        Input  : "automation"
//        Output : "automin"

import java.util.Iterator;
import java.util.LinkedHashSet;

public class removeDuplicateChar {
    public static void main(String[] args) {

        String str="automation";

        // 1st approach
//            StringBuilder sb=new StringBuilder();
//
//            for (char ch:str.toCharArray()){
//                if( !sb.toString().contains(String.valueOf(ch)))
//                    sb.append(ch);
//            }
//        System.out.println(sb);

        System.out.println("===========================================================================");
        //2nd approach

        LinkedHashSet<Character> set=new LinkedHashSet<>();

        for (char ch: str.toCharArray()){
            set.add(ch);
        }
//        System.out.println(set);
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next());
        }
    }
}
