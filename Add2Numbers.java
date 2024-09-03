class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t=new ListNode(0);
            ListNode d=t;
            int ca=0;

            while(l1!=null || l2!=null || ca!=0){
                int s=ca;
                if(l1!=null){
                    s=s+l1.val;
                    l1=l1.next;
                }
                if(l2!=null){
                    s=s+l2.val;
                    l2=l2.next;
                }
                d.next=new ListNode(s%10);
                ca=s/10;
                d=d.next;
            }
            return t.next;
    }
}