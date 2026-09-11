/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        ListNode link = null;
        while (temp != null && temp.next != null) {
            link = temp.next;
            ListNode g = new ListNode(gcd(temp.val, temp.next.val));
            temp.next = g;
            g.next = link;
            temp = temp.next.next;
        }
        return head;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}