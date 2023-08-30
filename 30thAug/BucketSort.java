// This is bucket sort.
// Bucket sort is an approach to sorting, where we divide the array into buckets, and sort each bucket individually.
// This is a O(n) algorithm.
// This is not an in-place algorithm (extra memory is required).
// This is not a stable algorithm (the order of equal elements is not preserved).
// The best case time complexity of bucket sort is O(n + k), when all the elements are in the same bucket (k is the number of buckets).
// The worst case time complexity of bucket sort is O(n^2), when all the elements are in different buckets. This is the only case when bucket sort is not efficient.

import java.util.Arrays;

public class BucketSort {
    public static void main (String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort (int[] arr) {
        int n = arr.length;
        // we should find the range of the array, so that we can divide the array into buckets
        // we initialize them to the extreme values, so that we can find the actual values in the array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // here we find the range of the array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        // we divide the array into buckets based on the range
        int range = max - min + 1;
        // we find the number of buckets required
        int bucketCount = (int) Math.ceil((double) n / range);
        int[][] buckets = new int[bucketCount][0];
        // we add the elements to the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (arr[i] - min) / range;
            buckets[bucketIndex] = append(buckets[bucketIndex], arr[i]);
        }
        // we sort each bucket individually using insertion sort (we can use any sorting algorithm)
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            insertionSort(buckets[i]);
            for (int j = 0; j < buckets[i].length; j++) {
                arr[index++] = buckets[i][j];
            }
        }
    }

    public static int[] append (int[] arr, int element) {
        // creates a new array with the element appended to the end of the array and returns it
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = element;
        return newArr;
    }

    public static void insertionSort (int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = key;
        }
    }
}
