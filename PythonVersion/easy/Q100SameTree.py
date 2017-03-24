# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from TreeNode import *
class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        return self.checkStruct(p,q)

    def checkStruct(self,p,q):
        if(p==None):
            if(q==None):return True
            else: return False
        else:
            if(q==None):return False
            else:
                flag=False
                if(p.val!=q.val):return False
                if(self.checkStruct(p.left,q.left) and self.checkStruct(p.right,q.right)):flag=True
                return flag


object=Solution()
p=TreeNode(1)
pleft=TreeNode(2)
pright=TreeNode(3)
p.left=pleft
p.right=pright

q=TreeNode(1)
qleft=TreeNode(2)
qright=TreeNode(3)
q.left=qleft
q.right=qright
print object.isSameTree(p,q)