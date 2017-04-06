# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from TreeNode import TreeNode
class Solution(object):
    result=0
    def pathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: int
        """
        if(root==None):return
        if(sum==0):self.result+=1
        self.pathSum(root.left,sum-root.val)
        self.pathSum(root.left,sum)
        self.pathSum(root.right,sum-root.val)
        self.pathSum(root.right,sum)
        return self.result



root=TreeNode(10)
left1=TreeNode(5)
right1=TreeNode(-3)
root.left=left1
root.right=right1

left2=TreeNode(3)
right2=TreeNode(2)
left1.left=left2
left1.right=right2
left2.left=TreeNode(3)
left2.right=TreeNode(-2)

right3=TreeNode(1)
right2.right=right3

rightR=TreeNode(11)
right1.right=rightR



object=Solution()
print object.pathSum(root,8)