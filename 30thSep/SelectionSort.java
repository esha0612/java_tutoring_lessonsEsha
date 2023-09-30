// Seection sort is an approach where in each pass, the smallest element is selected and swapped with the current element.
// The algorithm gets its name from the way cards are sorted in a card game.
// After i passes, the first i elements are in sorted order.
// The algorithm needs to make at most n passes to sort n elements.
// The algorithm needs to make at most n-1 comparisons (or swaps) to sort n elements.
// This sort is stable is we use a swap function that swaps only if the elements are not equal, or if we right shift the elements instead of swapping.
// It is an in-place sort (which means that it does not require any extra storage space).
// The time complexity of the algorithm is O(n^2) in the worst case and O(n^2) in the best case.
// The space complexity of the algorithm is O(1).
// The best case occurs when the list is already sorted.
// The worst case occurs when the list is reverse sorted.
// The optimizations we can make to the algorithm are:
// 1. If no swaps are made in a pass, then the list is already sorted and we can stop.
// 2. The first i elements in the i-th pass are in the right place, so we don't need to check them again.

public class SelectionSort {
    int[] arr;

    public SelectionSort(int[] arr) {
        this.arr = arr;
    }

    public void swap(int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void sort() {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            int minValue = arr[i];
            for (int j = i+1; j < n; j++) {
                if (arr[j] < minValue) {
                    minIndex = j;
                    minValue = arr[j];
                }
            }
            swap(i, minIndex);
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort ss = new SelectionSort(arr);
        ss.sort();
        ss.print();
    }
}
