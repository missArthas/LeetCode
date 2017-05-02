class Solution(object):
    def countBits(self, num):
        """
        :type num: int
        :rtype: List[int]
        """
        result=[0]*(num+1)
        for i in range(1,num+1):
            result[i]=result[i&(i-1)]+1
        return result

object=Solution()
print object.countBits(5)