class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        if(x==0):
            return 0
        first=1597463174
        last=(first+x/first)/2
        while(last*last>x):
            last = (first + x / first) / 2
            first=last
        return last

object=Solution()
print object.mySqrt(4)