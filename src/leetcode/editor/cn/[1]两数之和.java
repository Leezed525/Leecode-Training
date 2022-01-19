
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    //2022-01-19 10:57:23
    //两数之和
    //编号：[1]
    
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        // TO TEST
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            int goal = target - nums[i];
            if(map.containsKey(goal)){
                return new int[]{map.get(goal), i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
