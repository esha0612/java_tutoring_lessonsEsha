// Insertion Sort is an approach where in each pass, the current element is inserted into its correct position in the sorted subarray.
// The algorithm gets its name from the way cards are sorted in a card game.
// After i passes, the first i elements are in sorted order.
// The algorithm needs to make at most n passes to sort n elements.
// The algorithm needs to make at most n-1 comparisons (or swaps) to sort n elements.
// It is a stable sort (which means that the relative order of equal elements is preserved).
// It is an in-place sort (which means that it does not require any extra storage space).
// The time complexity of the algorithm is O(n^2) in the worst case and O(n) in the best case.
// The space complexity of the algorithm is O(1).
// The best case occurs when the list is already sorted.
// The worst case occurs when the list is reverse sorted.
// The optimizations we can make to the algorithm are:
// 1. If no swaps are made in a pass, then the list is already sorted and we can stop.
// 2. The first i elements in the i-th pass are in the right place, so we don't need to check them again.

public class InsertionSort {
    int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        InsertionSort is = new InsertionSort(arr);
        is.sort();
        is.print();
    }
}
