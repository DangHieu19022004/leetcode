import java.util.HashMap;

public class twosum_2 {    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    };
    
    public static void main(String args[]) {
        twosum_2 solution = new twosum_2();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] indices = solution.twoSum(nums, target);
        System.out.println("[" + indices[0] + "," + indices[1] + "]");
    }
}
