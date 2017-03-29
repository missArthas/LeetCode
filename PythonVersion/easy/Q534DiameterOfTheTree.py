# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from TreeNode import TreeNode
class Solution(object):
    def diameterOfBinaryTree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        self.result=-999999
        if(root==None):return 0
        self.maxDepth(root)
        return self.result-1

    def maxDepth(self,root):
        if(root==None):return 0
        left=self.maxDepth(root.left)
        right=self.maxDepth(root.right)
        self.result=max(self.result,left+right+1)
        return 1+max(left,right)

object=Solution()
node1=TreeNode(1)

node2=TreeNode(2)
node3=TreeNode(3)

node4=TreeNode(4)
node5=TreeNode(5)

node1.left=node2
node1.right=node3

node2.left=node4
node2.right=node5

print object.diameterOfBinaryTree(node1)