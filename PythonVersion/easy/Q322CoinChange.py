class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        sum=[-1 for i in range(amount+1)]
        sum[0]=0
        for i in coins:
            if i<=amount:
                sum[i]=1
        for i in range(1,amount+1):
            target=[]
            for t in coins:
                if i-t>=0 and sum[i-t]>-1:
                    target.append(sum[i-t])
            if(len(target)>0 and min(target)>-1):
                sum[i]=min(target)+1
            else:
                sum[i]=-1
        return sum[amount]


object=Solution()
print object.coinChange([1,2,5],11)
print object.coinChange([1,2],4)