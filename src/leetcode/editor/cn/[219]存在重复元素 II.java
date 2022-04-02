package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class ContainsDuplicateIi {
    //2022-01-19 13:03:27
    //存在重复元素 II
    //编号：[219]

    public static void main(String[] args) {
        Solution solution = new ContainsDuplicateIi().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            boolean flag = false;
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])){
                    if(i - map.get(nums[i]) <= k){
                        flag = true;
                        break;
                    }
                    else{
                        map.put(nums[i],i);
                    }
                }
                else{
                    map.put(nums[i],i);
                }
            }
            return flag;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
