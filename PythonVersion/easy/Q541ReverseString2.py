class Solution(object):
    def reverseStr(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        listStr=list(s)
        i=0
        strLen=len(s)
        while(i<strLen):
            if(i+2*k<strLen):
                self.changeStr(listStr,i,i+k)
            elif(i+k<strLen):
                self.changeStr(listStr, i, i + k)
            else:
                self.changeStr(listStr, i, strLen)
            i+=2*k
        return "".join(listStr)

    def changeStr(self,listStr,start,end):
        i=start
        j=end-1
        while(i<j):
            t=listStr[i]
            listStr[i]=listStr[j]
            listStr[j]=t
            i=i+1
            j=j-1


object=Solution()
print object.reverseStr("",2)
