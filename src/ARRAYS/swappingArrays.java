package ARRAYS;

import java.util.Arrays;

public class swappingArrays {
    public static void main(String[] args) {
        int[] arr = { 1,12,3,14,5};
        swap(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
