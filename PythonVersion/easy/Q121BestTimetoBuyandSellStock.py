class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if(not prices):
            return 0
        result=0
        l=len(prices)
        min=prices[0]
        for i in range(l):
            if(prices[i]<min):
                min=prices[i]
            if(prices[i]-min>result):
                result=prices[i]-min
        return result

object=Solution()
print object.maxProfit([7,1,5,3,6,4])