package Recursion;

public class findWhetherTheArrayIsSortedOrNot {
    public static boolean isSorted(int arr[], int i) {
        if (i + 1 == arr.length)
            return true;

        return arr[i] < arr[i + 1] && isSorted(arr, ++i);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 10, 21, 49, 88 };
        int notSortArr[] = { 1, 2, 3, 4, 5, 8, 7 };
        System.out.println(isSorted(arr, 0));
        System.out.println(isSorted(notSortArr, 0));
    }
}
