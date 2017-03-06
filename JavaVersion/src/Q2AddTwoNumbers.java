/**
 * Created by shhuang on 2017/3/6.
 */
public class Q2AddTwoNumbers {
    public static void main(String args[]){
        Q2AddTwoNumbers object=new Q2AddTwoNumbers();
        ListNode num1=new ListNode(1);
        ListNode num2=new ListNode(1);
        ListNode num3=new ListNode(1);
        ListNode num7=new ListNode(7);
        num1.next=num2;
        num2.next=num3;
        num3.next=num7;

        ListNode num4=new ListNode(9);
        ListNode num5=new ListNode(8);
        ListNode num6=new ListNode(8);
        num4.next=num5;
        num5.next=num6;

        ListNode result=object.addTwoNumbers(num1,num4);
        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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

