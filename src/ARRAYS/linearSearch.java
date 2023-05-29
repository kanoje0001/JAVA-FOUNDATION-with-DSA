package ARRAYS;

public class linearSearch {
    public static int linearSearch(int[] number, int key){
       for (int i=0; i<number.length;i++){
           if(number[i]==key){
               return i;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] number = {12,13,14,15,16,17,18};
        int key = 11;

        int index = linearSearch(number,key);
            if (index == -1) {
                System.out.println("Key Not found");
            }   else {
                System.out.println("Key is at index "+ index);
            }

        }
    }

