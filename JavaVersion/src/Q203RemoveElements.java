/**
 * Created by shhuang on 2017/3/9.
 */
public class Q203RemoveElements {
    public static void main(String args[]){
        Q203RemoveElements object =new Q203RemoveElements();
        ListNode num1=new ListNode(1);
        ListNode num2=new ListNode(2);
        ListNode num3=new ListNode(2);
        ListNode num7=new ListNode(3);
        ListNode num8=new ListNode(3);
        num1.next=num2;
        num2.next=num3;
        num3.next=num7;
        num7.next=num8;
        ListNode result=object.removeElements(num1,1);

        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }


    public ListNode removeElements(ListNode head, int val) {
        ListNode result=new ListNode(-1);
        ListNode current=result;
        result.next=head;
        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }
            else current=current.next;
        }
        return result.next;
    }
}
