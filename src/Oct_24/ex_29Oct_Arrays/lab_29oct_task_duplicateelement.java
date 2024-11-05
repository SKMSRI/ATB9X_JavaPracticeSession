package Oct_24.ex_29Oct_Arrays;

public class lab_29oct_task_duplicateelement {
    public static void main(String[] args) {
        int arr[] = new int[] {3, 5, 4, 6, 8, 6, 9, 4};
        System.out.println("Duplicate arrary is");
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);

                }
            }
        }
    }
}