# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from TreeNode import TreeNode
class Solution(object):
    def hasPathSum(self, root, sum):
        """
        :type root: TreeNode
        :type sum: int
        :rtype: bool
        """
        if(root==None):return False

        if(root.left==None and root.right==None):
            if(sum-root.val==0):
                return True
            else:
                return False

        leftResult=self.hasPathSum(root.left,sum-root.val)
        rightResult=self.hasPathSum(root.right,sum-root.val)
        if(leftResult or rightResult):return True
        else:return False


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
print object.hasPathSum(root,19)