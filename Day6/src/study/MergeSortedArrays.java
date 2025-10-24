package study;

public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2]; // final array
        int i = 0, j = 0, k = 0;

        // merge until one array finishes
        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // copy remaining elements (if any)
        while (i < n1) {
            merged[k++] = nums1[i++];
        }
        while (j < n2) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};

        int[] result = merge(nums1, nums2);

        System.out.print("Merged array: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
