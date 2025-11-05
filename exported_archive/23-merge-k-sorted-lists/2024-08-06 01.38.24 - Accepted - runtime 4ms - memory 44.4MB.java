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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minheap = new PriorityQueue<>((a,b) -> Integer.compare(a.val, b.val));

        for(ListNode temp: lists){
            if(temp != null){
                minheap.offer(temp);
            }
        }

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while(!minheap.isEmpty()){
            ListNode node = minheap.poll();
            curr.next = node;
            curr = node;
            if(node.next != null){
                minheap.offer(node.next);
            }
        }

        return dummy.next;
    }
}