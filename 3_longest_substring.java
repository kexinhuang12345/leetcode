class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < len; i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i))); // slided forward
            }
            ans = Math.max(ans, i-j+1);
            map.put(s.charAt(i),i+1);
        }
        return ans;
    }
}
