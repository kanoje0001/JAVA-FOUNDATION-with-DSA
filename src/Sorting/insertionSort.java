package Sorting;

public class insertionSort {
    public static void bubbleSort(int[] arr) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap in outerloop

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            // finding out the currect position to insert arr
            while (prev >= 0 && arr[prev] >curr){
                arr[prev+1] = arr[prev];
                prev --;

            }
            //insertion of array
            arr[prev + 1 ] = curr;

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 7, 3};
        int[] arr1 = {12,1,23,12,26,77};
        insertionSort(arr);
        selectionSort(arr1);
        printArr(arr1);
        printArr(arr);
    }
}