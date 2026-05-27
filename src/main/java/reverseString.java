import java.util.Scanner;

// Problem Statement : Reverse the string.

public class reverseString {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the string");
//        String str=sc.nextLine();
        String str="random string";

        // 1st approach
            for(int i=str.length()-1;i>=0;i--){
                System.out.print(str.charAt(i));
            }
        System.out.println("\n============================");
        // 2nd approach
            StringBuilder sb=new StringBuilder(str);
            System.out.println(sb.reverse());
    }
}
