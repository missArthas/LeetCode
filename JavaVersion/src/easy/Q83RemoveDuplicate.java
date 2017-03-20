package easy;

/**
 * Created by shhuang on 2017/3/7.
 */
public class Q83RemoveDuplicate {
    public static void main(String args[]){
        Q83RemoveDuplicate object =new Q83RemoveDuplicate();
        ListNode num1=new ListNode(1);
        ListNode num2=new ListNode(2);
        ListNode num3=new ListNode(2);
        ListNode num7=new ListNode(3);
        ListNode num8=new ListNode(3);
        num1.next=num2;
        num2.next=num3;
        num3.next=num7;
        num7.next=num8;
        ListNode result=object.deleteDuplicates(num1);

        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode result=head;
        while(head!=null&&head.next!=null){
            if(head.val==head.next.val) head.next=head.next.next;
            else head=head.next;
        }
        return result;
    }
}
