package Recursion;
import java.util.ArrayList;

public class possibleSubsetsOfAnArray {
    public static void possibleSubset(int arr[], int start, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
        System.out.println(list);
        result.add(new ArrayList<>(list));  // Add a copy of the current subset to the result

        for (int i = start; i < arr.length; i++) {
            list.add(arr[i]);
            possibleSubset(arr, i + 1, list, result);  // Use i + 1 instead of ++start
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        possibleSubset(arr, 0, new ArrayList<>(), result);

        // Print the result if needed
        System.out.println("All Subsets: " + result);
    }
}
