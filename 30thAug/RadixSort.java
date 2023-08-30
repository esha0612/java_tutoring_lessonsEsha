// This is radix sort.
// Radix sort is a non-comparative sorting algorithm.
// It sorts the elements by grouping them by the individual digits which share the same significant position and value.
// It can be applied to data that can be sorted lexicographically, like integers and strings.
// It is a stable algorithm (the order of equal elements is preserved).
// It is not an in-place algorithm (extra memory is required).
// It is not an adaptive algorithm (the time complexity is not affected by the input).
// It is not a comparison based algorithm (the time complexity is not O(nlogn)).
// It is a linear time algorithm (O(n)).
// It is not an online algorithm (the input size needs to be known beforehand).
// It is not a cache friendly algorithm (it has poor locality of reference).

import java.util.Arrays;

public class RadixSort {
    public static void main (String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort (int[] arr) {
        int n = arr.length;
        // we find the maximum element in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        // we sort the array based on each digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    public static void countSort (int[] arr, int exp) {
        int n = arr.length;
        // we create a count array to store the count of each element
        int[] count = new int[10];
        // we store the count of each element in the count array
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        // we update the count array to store the actual position of each element in the output array
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        // we create an output array to store the sorted array
        int[] output = new int[n];
        // we store the elements in the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        // we copy the elements from the output array to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
