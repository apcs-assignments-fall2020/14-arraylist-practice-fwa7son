import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int c = 0;
        for (int i: list){
            if (i%2 !=0){
                c ++;
            }
        }
        return c;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int a : list1){
            for (int b : list2){
                if(a==b){
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(int i = 0; i<arr.length; i++){
            list1.add(arr[i]);
        }

        return list1;
    }


    public static void main(String[] args) {
        ArrayList<Integer> listint1 = new ArrayList<Integer>(Arrays.asList(4,2,5,7,1));
        ArrayList<Integer> listint2 = new ArrayList<Integer>(Arrays.asList(5,6,7,8,9));
        System.out.println(countOdd(listint1));
        System.out.println(checkDuplicates(listint1, listint2));
        int[] arr = {5,4,3,2,1};
        System.out.println(convertToArrayList(arr));
        // Write some code here to test your methods!
    }
}
