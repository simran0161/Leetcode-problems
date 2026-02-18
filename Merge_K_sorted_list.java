class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)-> a.val-b.val);

        for(ListNode ptr:lists){
            if(ptr!=null)pq.offer(ptr);
        }

        ListNode dummynode=new ListNode(-1);
        ListNode temp=dummynode;

        while(!pq.isEmpty()){
            ListNode curr=pq.poll();

            temp.next=curr;
            temp=temp.next;

            if(curr.next!=null){
                pq.offer(curr.next);
            }

        }

        return dummynode.next;
    }
}