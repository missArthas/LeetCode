class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        sum=0
        while(x!=0 or y!=0):
            t1=x%2
            t2=y%2

            x=x/2
            y=y/2
            if(t1!=t2): sum=sum+1
        return sum

object=Solution()
print object.hammingDistance(1,4)