/**
 * Created by shhuang on 2017/3/6.
 */
public class Q445AddTwoNumbers2 {
    public static void main(String args[]){
        Q445AddTwoNumbers2 object=new Q445AddTwoNumbers2();
        ListNode num1=new ListNode(9);
        ListNode num2=new ListNode(0);
        ListNode num3=new ListNode(0);
        ListNode num7=new ListNode(1);
        num1.next=num2;
        num2.next=num3;
        num3.next=num7;

        ListNode num4=new ListNode(9);
        ListNode num5=new ListNode(9);
        ListNode num6=new ListNode(9);
        num4.next=num5;
        num5.next=num6;

        ListNode result=object.reverse(num1);
        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    public ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode current=head;
        head=current.next;
        while(head!=null){
            current=head;
            head=head.next;
            head.next=current;
        }
        return head;
    }

}

