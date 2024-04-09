public class BinarySearch {
    protected static void BinarySearch(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int m = l + (r - l) / 2;
            // System.out.println("m: " + m);
            System.out.println("Middle Element: " + arr[m]);

            if (arr[m] == x) {
                System.out.println("Element found at index " + m);
                return;
            }

            if (arr[m] < x) {
                System.out.println("Discarding left half");
                BinarySearch(arr, m + 1, r, x);
            } else {
                System.out.println("Discarding right half");
                BinarySearch(arr, l, m - 1, x);
            }
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int n = arr.length;
        int x = 3;

        BinarySearch(arr, 0, n - 1, x);
    }
}
