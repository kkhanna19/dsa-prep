package Array;

public class SortHalfInAandD {
    public static void main(String[] args) {
        int[] arr = {20, 4, 89, 56, 34, 18};

        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sorting(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            for (int k = n / 2; k < n - 1; k++) {
                if (arr[k] < arr[k + 1]) {
                    int swap = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = swap;
                }
            }
        }

    }
}
