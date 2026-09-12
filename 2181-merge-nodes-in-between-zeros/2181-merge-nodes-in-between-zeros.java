class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode ans = head;
        while (temp != null) 
        {
            int sum = 0;
            while (temp != null && temp.val != 0) {
                sum += temp.val;
                temp = temp.next;
            }
            ans.val = sum;
            if (temp != null) {
                temp = temp.next;
                if (temp != null) {
                    ans.next = temp;
                    ans = ans.next;
                }
            }
        }
        ans.next = null;
        return head;
    }
}