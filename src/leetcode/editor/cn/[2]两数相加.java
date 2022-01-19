
package leetcode.editor.cn;

class AddTwoNumbers {
    //2022-01-19 11:01:48
    //两数相加
    //编号：[2]

    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
        // TO TEST
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
//Definition for singly-linked list.


    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int progress = 0;
            ListNode ansHead = new ListNode();
            ListNode tmpNode = ansHead;
            while (l1 != null || l2 != null) {
                tmpNode.next = new ListNode();
                tmpNode = tmpNode.next;
                int num1, num2;
                if (l1 == null) {
                    num1 = 0;
                } else {
                    num1 = l1.val;
                    l1 = l1.next;
                }
                if (l2 == null) {
                    num2 = 0;
                } else {
                    num2 = l2.val;
                    l2 = l2.next;
                }
                int tmp = num1 + num2 + progress;
                progress = tmp / 10;
                tmpNode.val = tmp % 10;
            }
            if(progress != 0){
                tmpNode.next = new ListNode();
                tmpNode = tmpNode.next;
                tmpNode.val = progress;
            }
            return ansHead.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
