class Solution(object):
    table = {4: 1, 16: 1, 37: 1, 58: 1, 89: 1, 145: 1, 42: 1, 20: 1}
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if(n==1):return True;
        if(self.table.has_key(n)):
            return False
        else:
            sum=0
            while(n!=0):
                t=n%10
                sum+=(t*t)
                n=n/10
            return self.isHappy(sum)
object=Solution()
print object.isHappy(6)