# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None
from ListNode import ListNode
class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if(l1==None):
            return l2
        if(l2==None):
            return l1

        if(l2.val<l1.val):
            t=l1
            l1=l2
            l2=t
        result=l1
        current=l1
        l1=l1.next

        while(l1!=None and l2!=None):
            if(l1.val<=l2.val):
                t=l1
                l1=l1.next
            else:
                t=l2
                l2=l2.next
            current.next=t
            current=t

        if(l1!=None):
            current.next=l1
        elif(l2!=None):
            current.next=l2
        return result


object=Solution()
l1=ListNode(1)
l1.next=ListNode(3)
l2=ListNode(2)
l2.next=ListNode(5)
root=object.mergeTwoLists(l1,None)

while(root!=None):
    print root.val
    root=root.next
