// The idea is to keep dividing the array into two halves until we reach the base case of having only one element in the array.
// Then we merge the two halves by comparing the elements of the two halves and putting them in the correct order.
// Each half is already sorted, so we need to compare the leftmost element of the left half with the leftmost element of the right half.

public class MergeSort {
    protected static void Merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.out.println("Left half: ");
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
            System.out.print(L[i] + " ");
        }

        System.out.println("\nRight half: ");
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
            System.out.print(R[j] + " ");
        }

        System.out.println();

        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;
        int k = l;

        // Compare the leftmost element of the left half with the leftmost element of the right half at each step
        // Whichever is smaller is put in the merged array, and the index of that half is incremented
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // If there are any elements left in the left half, put them in the merged array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // If there are any elements left in the right half, put them in the merged array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    protected static void MergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
            Merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        System.out.println("Given array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        MergeSort(arr, 0, n - 1);

        System.out.println("\nSorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
