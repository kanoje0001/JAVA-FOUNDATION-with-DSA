package ARRAYS;

public class pairsArray {
    public static int printpairs(int[] numbers) {
        int topairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                System.out.println("(" + curr + "," + numbers[j] + ")");
                topairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs = " + topairs);
        return topairs;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8};
        System.out.println(printpairs(ar));
    }
}
