package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class LongestSubstringWithoutRepeatingCharacters{
    //2022-01-19 12:39:48
    //无重复字符的最长子串
    //编号：[3]
    
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        // TO TEST
        System.out.println(solution.lengthOfLongestSubstring("abba"));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        int max_count = 0;
        int left_pos = 0;
        for(int i = 0;i < str.length;i++){
            if(map.containsKey(str[i])){
                int old_pos = map.get(str[i]);
                if (old_pos >= left_pos){
                    left_pos = old_pos  + 1;
                }
                map.put(str[i],i);
            }else{
                map.put(str[i],i);
            }
            max_count = Math.max(max_count,i - left_pos + 1);
        }

        return max_count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
