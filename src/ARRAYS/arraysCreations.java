package ARRAYS;

public class arraysCreations {

    public static void marks(int[] marks){
        for (int i = 0; i<marks.length; i++){
            marks[i]+=1;
        }

    }
    public static void main(String[] args) {
      int[] marks = {99,98,97,96};
      Update(marks);
        for (int i = 0; i<marks.length; i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();

    }

    private static void Update(int[] marks) {
        for (int i = 0; i<marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
    }


}
