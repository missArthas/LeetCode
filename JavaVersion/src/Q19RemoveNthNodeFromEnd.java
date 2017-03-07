/**
 * Created by shhuang on 2017/3/6.
 */
public class Q19RemoveNthNodeFromEnd {
    public static void main(String args[]){
        Q19RemoveNthNodeFromEnd object =new Q19RemoveNthNodeFromEnd();
        ListNode num1=new ListNode(9);
        ListNode num2=new ListNode(8);
        ListNode num3=new ListNode(7);
        ListNode num7=new ListNode(1);
        num1.next=num2;
        num2.next=num3;
        num3.next=num7;
        ListNode result=object.removeNthFromEnd(num1,4);
        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new ListNode(-1);
        temp.next=head;
        head=temp;

        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int nth=length-n;
        temp=head;
        for(int i=0;i<nth-1;i++){
            temp=temp.next;
        }
        ListNode result=temp.next;
        temp.next=temp.next.next;
        return head.next;
    }
}
