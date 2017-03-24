class Solution(object):
    def convertToBase7(self, num):
        """
        :type num: int
        :rtype: str
        """
        result=""
        t=num
        if(num==0): return "0"
        if(num<0): t=-num
        while(t>0):
            result=result+str(t%7)
            t=t/7
        if(num<0): result=result+"-"
        return result[::-1]

object=Solution()
print object.convertToBase7(99)
print object.convertToBase7(-7)
