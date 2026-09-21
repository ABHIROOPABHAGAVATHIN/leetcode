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
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(ListNode val:lists ){ 
         ListNode head=val;
        while(head!=null){ 
            pq.add(head.val);
            head=head.next;
        }}
       ListNode abhi=new ListNode(0);
       ListNode cur=abhi;
       while(!pq.isEmpty()){
        cur.next=new ListNode(pq.poll());
        cur=cur.next;
       }
        return abhi.next;
    }
}