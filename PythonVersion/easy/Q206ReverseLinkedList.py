from ListNode import *
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if(head==None):return None
        start=head
        mid=head.next
        end=None
        if(head.next!=None):
            end=mid.next
        while(end!=None):
            mid.next=start
            start=mid
            mid=end
            end=end.next

        head.next = None
        if(mid!=None):
            mid.next=start
            return mid
        else:
            return head

object=Solution()
list1=ListNode(1)
list2=ListNode(2)
list3=ListNode(3)
list4=ListNode(4)
list1.next=list2
list2.next=list3
list3.next=list4
head=object.reverseList(None)
while(head!=None):
    print head.val
    head=head.next
