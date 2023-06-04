package ARRAYS;

public class largeFactorial {
        public static long[] fact(long a[], int N){
            long max = 0;
            for(int i=0; i<N; i++){
                if(a[i]>max){
                    max = a[i];
                }
            }
            long arr[] = new long[(int)max+1];
            arr[0]= 1;
            for(int i=1; i<arr.length; i++){
                arr[i]= (i*arr[i-1])%((int)Math.pow(10,9)+7);
            }
            for(int i=0; i<N; i++){
                a[i] = arr[(int)a[i]];
            }
            return a;
        }
        public static void main(String[] args) {
            long a[] = {0,1,2,3,4};
            int N = 5;
            long[] result = fact(a, N);
            for (long num : result) {
                System.out.print(num+" ");
            }
        }
}
