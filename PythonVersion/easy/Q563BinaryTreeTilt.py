from TreeNode import TreeNode
class Solution(object):
    result=0
    def findTilt(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if(root==None):
            return 0
        self.treeSum(root)
        return self.result

    def treeSum(self,root):
        if(root==None):
            return 0
        left=self.treeSum(root.left)
        right=self.treeSum(root.right)
        self.result+=abs(left-right)
        return root.val+left+right

root=TreeNode(1)
left1=TreeNode(2)
left1.left=TreeNode(4)
right1=TreeNode(3)
right1.left=TreeNode(5)
root.left=left1
root.right=right1


object=Solution()
print object.findTilt(root)
