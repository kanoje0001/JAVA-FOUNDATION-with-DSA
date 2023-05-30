package Sorting;

public class selectionSort {
    public static void bubbleSort(int[] arr){
    for (int turn=0; turn<arr.length-1;turn++){
        for (int j=0; j< arr.length-1-turn; j++){
            if (arr[j] > arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                                   }
                         }
                   }
              }
    public static void printArr(int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int arr[]){
            for (int i = 0; i<arr.length-1; i++){
                int minPos = i;
                for (int j = i+1 ; j<arr.length; j++){
                    if (arr[minPos] > arr[j]){
                        minPos = j;
                    }
                }
                //swap in outerloop

                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
            }
    }

    public static void main(String[] args) {
        int[] arr = {5,6,4,7,3};
        selectionSort(arr);
        printArr(arr);
    }
}

