package Sorting;

public class questionBISC {
    public static void bubbleSort(int[] arr){
        for (int turn = 0; turn<arr.length-1; turn++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void seletionSort(int[] arr){
        for (int i = 0; i< arr.length - 1; i++){
            int minPos = i;
            for (int j = i+1; j < arr.length ; j++){
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 0; i< arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev + 1] = curr;
        }
    }
    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.println(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,4,4,8,9,4};
        insertionSort(arr);
        printArray(arr);
        System.out.println( );
        seletionSort(arr);
        printArray(arr);
        System.out.println( );
        bubbleSort(arr);
        printArray(arr);
    }
}

