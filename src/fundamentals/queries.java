package fundamentals;

import java.util.Scanner;

public class queries {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum =0;
            for(int j=l; j<=r; j++){
                sum+=arr[j];
            }
            System.out.println(sum);
        }

    }
}
