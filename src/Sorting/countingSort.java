package Sorting;

public class countingSort {
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

        public static void countingSort(int arr[]){
            int largest = Integer.MIN_VALUE;
            for (int i=0; i< arr.length; i++){
                largest = Math.max(largest,arr[i]);
            }
            int[] count = new int [largest+1];
            for (int k : arr) {
                count[k]++;
            }
            int j =0;
            for (int i = count.length-1; i>=0; i--){
                while (count[i] < 0){
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }
        public static void printArr(int[] arr){
            for (int j : arr) {
                System.out.println(j + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] arr = {5,6,9,7,3};
            countingSort(arr);
            printArr(arr);
        }


}
