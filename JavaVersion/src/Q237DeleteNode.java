/**
 * Created by shhuang on 2017/3/7.
 */
public class Q237DeleteNode {

    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;

    }
}
