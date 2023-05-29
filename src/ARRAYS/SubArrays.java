package ARRAYS;

public class SubArrays {
    public static void printSubarrays(int numbers[]) {
        int totalsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            totalsum = 0;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.println(numbers[k] + " ");
                }
                totalsum++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Arrays equals " + totalsum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,6,7};
        printSubarrays(numbers);
    }
}