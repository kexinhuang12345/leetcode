class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i< nums.length; i++){
            int c = target-nums[i];
            if (m.containsKey(c)){
                return new int[] {m.get(c),i};
            }
            m.put(nums[i],i);
        }
        throw new IllegalArgumentException("input argument no solution");
    }
}
