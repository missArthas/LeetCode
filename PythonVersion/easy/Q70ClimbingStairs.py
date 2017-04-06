class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if(n==1 or n==2):return n
        pre2=1
        pre1=2
        result=pre1
        for i in range(2,n):
            t=pre1
            pre1+=pre2
            pre2=t
        return pre1

object=Solution()
print object.climbStairs(3)