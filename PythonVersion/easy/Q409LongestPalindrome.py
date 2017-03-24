class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        s=sorted(s)
        s.append("!")
        flag=False
        strLen=1
        totalLen=0
        for i in range(len(s)-1):
            if(s[i]==s[i+1]):
                strLen=strLen+1
            else:
                if(strLen%2==0):
                    totalLen=totalLen+strLen
                else:
                    flag=True
                    totalLen=totalLen+strLen-1
                strLen=1
        if(flag):
            totalLen=totalLen+1
        return totalLen



object=Solution()
print object.longestPalindrome("aa")