class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        if(s==None or s==""):
            return s
        temp=s.split(' ')
        result=""
        resultLen=len(result)
        for t in temp:
            result=result+t[::-1]+" "

        result=result[0:-1]
        return result

object=Solution()
print object.reverseWords("Let's take LeetCode contest")