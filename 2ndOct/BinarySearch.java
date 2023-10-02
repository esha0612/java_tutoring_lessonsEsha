// Binary Search is a more efficient approach
// Time Complexity: O(log n)
// Space Complexity: O(1)
// Binary Search, like Merge Sort, is based on a divide and conquer approach
// The idea is to divide the array into two halves and check if the element is present in the first half or the second half
// So for this to work, the array itself must be sorted
// If the element is present in the first half, then we can discard the second half
// If the element is present in the second half, then we can discard the first half
// We can keep doing this until we find the element

public class BinarySearch {
    int [] arr;

    public BinarySearch(int [] arr) {
        this.arr = arr;
    }

    public boolean isSorted() {
        // just to check if array is sorted, otherwise binary search won't work
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public void sort() {
        // just to sort the array, otherwise binary search won't work
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            } 
        }
    }

    public int search(int key) {
        if(!isSorted()) {
            sort();
            // return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String [] args) {
        int [] arr = {1, 2, 3, 4, 5};
        BinarySearch bs = new BinarySearch(arr);
        System.out.println(bs.search(2));
    }
}
