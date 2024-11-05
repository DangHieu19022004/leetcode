import java.util.Arrays;

public class MedianOfTwoSortArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        int arr[] = new int[nums1.length + nums2.length];
        System.arraycopy(nums1,0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);
        Arrays.sort(arr);

        if(arr.length % 2 == 0 ){
            result = (arr[arr.length/2] + arr[arr.length/2 - 1]) / 2.0;
        } else {
            result = arr[arr.length/2];
        }
        
        return result;
    }

    public static void main(String[] arr){
        System.err.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }
}