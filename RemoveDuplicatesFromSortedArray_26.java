import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // con trỏ lưu vị trí của phần tử duy nhất tiếp theo
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1; // số lượng phần tử duy nhất
    }

    public static void main(String args[]) {
        RemoveDuplicatesFromSortedArray_26 solution = new RemoveDuplicatesFromSortedArray_26();
        int[] nums1 = {1, 1, 2};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println(k1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, k1)) + " -> Expected: 2, [1, 2]");
    }
}
