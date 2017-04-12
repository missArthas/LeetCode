class Solution(object):
    def isPerfectSquare(self, num):
        """
        :type num: int
        :rtype: bool
        """
        sum=1
        template=1
        while(sum<num):
            template+=2
            sum+=template
        if(sum==num):
            return True
        else:
            return False
object=Solution()
print object.isPerfectSquare(1648155645)