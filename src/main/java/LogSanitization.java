// Problem Statement
//You are given a log string.
//        Replace all digits with * except:
//        last 4 digits of any continuous number sequence should remain visible
// Input : User account 9876543210 logged in with otp 456789
// output : User account ******3210 logged in with otp **6789
//
// Input : Order ID: AB1234XY and phone 9988776655
// output : Order ID: AB1234XY and phone ******6655  (Notice AB1234XY should NOT be masked because digits are not a standalone numeric sequence.)

// edge cases : for below input it will fail the code.
// "phone:9876543210"  why --> Because splitting by space gives..
// "9876543210,"  why --> comma attached.

public class LogSanitization {
    public static void main(String[] args) {
//        String str= "User account 9876543210 logged in with otp 456789";
//        String str="Order ID: AB1234XY and phone 9988776655";
            String str="User account 9876543210 logged in";

        String [] arr= str.split(" ");

        for (int i=0;i<arr.length;i++){
            if (isWholeStringInteger(arr[i])) {
                if(arr[i].length()>4){
                    for (int j=0;j<arr[i].length();j++){
                        if (j<(arr[i].length()-4))
                            System.out.print("*");
                        else
                            System.out.print(arr[i].charAt(j));
                    }
                }
                else {
                    System.out.print(arr[i]+" ");
                }
            }
            else
                System.out.print(arr[i]+" ");
        }

    }

//    Edge cases for isWholeStringInteger()
//    "123"
//    "-123"  is not handled in below code
//    "+123"  is not handled in below code
//    "12.5"
//    "abc"
//    ""
//    null
//    " 123 "
//    "999999999999999999"
    public static boolean isWholeStringInteger(String str){
            if(str== null)
                return  false;
            str=str.trim();
            if (str.isEmpty())
                return false;

            for (int i=0;i<str.length();i++){
                if (!Character.isDigit(str.charAt(i)))
                    return  false;
            }
            return true;
    }
}
