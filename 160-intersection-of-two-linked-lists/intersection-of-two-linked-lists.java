/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        // Edge case: If either list is empty, they cannot intersect
        if (headA == null || headB == null) {
            return null;
        }

        // Initialize two pointers starting at the heads of both lists
        ListNode pA = headA;
        ListNode pB = headB;

        // Loop until both pointers meet at the exact same node (or both hit null)
        while (pA != pB) {
            
            // Move pA forward. If it hits the end, teleport it to the start of List B
            if (pA == null) {
                pA = headB;
            } else {
                pA = pA.next;
            }

            // Move pB forward. If it hits the end, teleport it to the start of List A
            if (pB == null) {
                pB = headA;
            } else {
                pB = pB.next;
            }
        }

        // Return the intersection node (or null if they never intersected)
        return pA;
    }
}