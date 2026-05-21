class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> nums2 = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            boolean res = nums2.add(nums[i]);
            if (res == false) {
                return true;
            }
        }
        return false;
    }
}