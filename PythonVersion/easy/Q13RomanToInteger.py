class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        result=0
        map = [["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"],
               ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"],
               ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"],
               ["", "M", "MM", "MMM"]]
        for i in range(3,-1,-1):
            temp=pow(10,i)
            k=0
            for j in range(0,len(map[i])):
                if(s.startswith(map[i][j])):
                    k=j
            result+=temp*k
            startLen=len(map[i][k])
            s=s[startLen:]
            if(len(s)==0):
                return result
        return result

object=Solution()
print object.romanToInt("MMMCLXXIX")
