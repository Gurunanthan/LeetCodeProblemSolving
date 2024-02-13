package Recursion;

import java.util.ArrayList;
import java.util.List;

public class findAllTheIndexOfTheTargetElement {
    
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5 };
        List<Integer> result = findAll(arr, 4, 0);
        System.out.println(result);
    }

    static List<Integer> findAll(int arr[], int target, int i) {
        List<Integer> li = new ArrayList<>();

        if (i == arr.length)
            return li;
        if (arr[i] == target) {
            li.add(i);
        }
        List<Integer> ans=findAll(arr, target, ++i);
        li.addAll(ans);
        return li;

    }
}
