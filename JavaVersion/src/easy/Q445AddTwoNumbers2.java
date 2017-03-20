package easy;

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

        ListNode result=object.addTwoNumbers(num7,num6);
        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1=reverse(l1);
        ListNode rl2=reverse(l2);
        ListNode result=addTwoNumber(rl1,rl2);
        return reverse(result);

    }

    public ListNode reverse(ListNode head){
        if(head.next==null) return head;
        ListNode current=head;
        head=current.next;
        current.next=null;
        while(head!=null){
            ListNode t=head.next;
            head.next=current;
            current=head;
            head=t;

        }
        return current;
    }

    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        int firstNum=l1.val+l2.val;
        int flag;
        if(firstNum>=10) flag=1;
        else flag=0;
        ListNode result=new ListNode(firstNum%10);
        ListNode numA=l1.next;
        ListNode numB=l2.next;
        ListNode current=result;

        while(numA!=null&&numB!=null){
            int intSum=numA.val+numB.val+flag;
            if(intSum>=10) flag=1;
            else flag=0;
            ListNode next=new ListNode(intSum%10);
            next.next=null;
            current.next=next;
            numA=numA.next;
            numB=numB.next;
            current=next;
        }

        while (numA!=null){
            int intSum=numA.val+flag;
            if(intSum>=10) flag=1;
            else flag=0;
            ListNode next=new ListNode(intSum%10);
            next.next=null;
            current.next=next;
            numA=numA.next;
            current=next;
        }

        while (numB!=null){
            int intSum=numB.val+flag;
            if(intSum>=10) flag=1;
            else flag=0;
            ListNode next=new ListNode(intSum%10);
            next.next=null;
            current.next=next;
            numB=numB.next;
            current=next;
        }
        if(flag==1) {
            ListNode next=new ListNode(1);
            next.next=null;
            current.next=next;
        }
        return result;
    }

}

