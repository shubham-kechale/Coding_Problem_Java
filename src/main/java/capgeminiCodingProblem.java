// problem statement
// Input: product_names = ["Milk", "Bread", "Eggs", "Milk", "Cheese"] product_to_prioritize = "Milk"
// Output: ["Milk", "Milk", "Bread", "Eggs", "Cheese"]
import  java.util.*;

public class capgeminiCodingProblem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of product");
        int n=sc.nextInt();
        sc.nextLine();

        ArrayList<String> product_names =new ArrayList<>();
        System.out.println("Enter the productName : ");
        for (int i=0;i<n;i++){
            product_names.add(sc.nextLine());
        }
        System.out.println("Enter product name that needs to be prioritize");
        String product_to_prioritize=sc.nextLine();

        LinkedList<String> result=new LinkedList<>();
        for (String str: product_names){
            if (str.equalsIgnoreCase(product_to_prioritize)){
                result.addFirst(str);
            }
            else
                result.addLast(str);
        }
        System.out.println(result);
    }
}
