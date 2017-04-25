class Solution(object):
    def checkRecord(self, s):
        """
        :type s: str
        :rtype: bool
        """
        flag=True
        l=len(s)
        a=0
        s=s.upper()
        for i in range(l):
            if(s[i]=="A"):
                a+=1
            elif(s[i]=="L"):
                if(i+1<l and s[i+1]=="L" and i+2<l and s[i+2]=="L"):
                    flag=False

        if(a>1):
            flag=False

        return flag

object=Solution()
print object.checkRecord("LALL")