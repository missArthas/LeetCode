/**
 * Created by shhuang on 2017/3/7.
 */
public class Q21MergeTwoSortedList {
    public static void main(String[] args){
        Q21MergeTwoSortedList object =new Q21MergeTwoSortedList();
        ListNode num1=new ListNode(1);
        ListNode num2=new ListNode(1);
        ListNode num3=new ListNode(1);
        ListNode num7=new ListNode(7);
        num1.next=num2;
        num2.next=num3;
        num3.next=num7;

        ListNode num4=new ListNode(7);
        ListNode num5=new ListNode(8);
        ListNode num6=new ListNode(9);
        num4.next=num5;
        num5.next=num6;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return null;
    }
}
