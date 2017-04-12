class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if(x==0):
            return 0
        sum=1
        template=1
        times=1
        while(sum<x):
            template+=2
            sum+=template
            times+=1
        if(sum==x):
            return times
        else:
            return times-1
object=Solution()
print object.mySqrt(1960499722)