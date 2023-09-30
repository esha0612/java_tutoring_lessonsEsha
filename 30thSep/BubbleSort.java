// Bubble sort is the closest to a brute force approach to sorting.
// It is not very efficient and is rarely used in practice.
// It is a stable sort (which means that the relative order of equal elements is preserved).
// It is an in-place sort (which means that it does not require any extra storage space).
// It is an adaptive sort (which means that it is faster when the input is partially sorted).
// The basic idea is to keep swapping adjacent elements if they are not in the right order.
// The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
// After i passes, the last i elements are in sorted order.
// The algorithm needs to make at most n passes to sort n elements.
// The algorithm needs to make at most n-1 comparisons (or swaps) to sort n elements.
// The optimizations we can make to the algorithm are:
// 1. If no swaps are made in a pass, then the list is already sorted and we can stop.
// 2. The last i elements in the i-th pass are in the right place, so we don't need to check them again.
// The time complexity of the algorithm is O(n^2) in the worst case and O(n) in the best case.
// The space complexity of the algorithm is O(1).
// The best case occurs when the list is already sorted.
// The worst case occurs when the list is reverse sorted.

public class BubbleSort {
    int[] arr;
    
    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void swap(int i, int j) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public void sort() {
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(j, j+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main (String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        BubbleSort bs = new BubbleSort(arr);
        bs.sort();
        bs.print();
    }
}
