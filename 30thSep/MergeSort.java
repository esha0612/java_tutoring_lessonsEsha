// Merge Sort is a divide and conquer approach where in each pass, the array is divided into two halves and then the two halves are merged.
// The time complexity of the algorithm is O(nlogn) in the worst case and O(nlogn) in the best case.
// The space complexity of the algorithm is O(n).
// The best case occurs when the list is already sorted.
// The worst case occurs when the list is reverse sorted.
// The basic idea is to divide the array into halves recursively until we reach a point where we have only one element in the array.
// Then we merge the two halves by comparing the elements in the two halves upwords.
// The algorithm needs to make at most logn passes to sort n elements.

public class MergeSort {
    int[] arr;

    public MergeSort(int[] arr) {
        this.arr = arr;
    }

    public void merge(int[] left, int[] right, int[] arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        int n1 = left.length;
        int n2 = right.length;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public void sort(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int j = mid; j < n; j++) {
            right[j-mid] = arr[j];
        }
        sort(left);
        sort(right);
        merge(left, right, arr);
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        MergeSort ms = new MergeSort(arr);
        ms.sort(arr);
        ms.print();
    }
}