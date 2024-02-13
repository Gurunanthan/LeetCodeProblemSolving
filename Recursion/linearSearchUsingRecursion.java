package Recursion;

public class linearSearchUsingRecursion {
    public static void main(String[] args) {
        int arr[]= {
            1,2,3
        };
        System.out.println(linearSearch(arr, 2, 0));
    }
    static boolean linearSearch(int arr[],int target,int pointer)
    {
        if(pointer==arr.length)return false;
        return arr[pointer]== target || linearSearch(arr,target,++pointer);

    }

}
