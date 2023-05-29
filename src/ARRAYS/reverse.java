package ARRAYS;

public class reverse {
    public static void reverse(int numbers[]){
        int first = 0; int last = numbers.length -1;

        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        reverse(number);
        for (int i = 0; i<number.length; i++){
            System.out.println(number[i] + " ");
        }
        System.out.println();
    }
}
