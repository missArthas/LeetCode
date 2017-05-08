class Solution(object):
    def findTargetSumWays(self, nums, S):
        """
        :type nums: List[int]
        :type S: int
        :rtype: int
        """
        totalSum=sum(nums)
        l=len(nums)
        nums[1:l]=nums[:]
        nums[0]=0
        if ((totalSum + S) % 2 == 1): return 0
        if(totalSum<S):return 0
        dp=[[0 for j in range(totalSum+1)] for i in  range(l+1)]
        for i in range(l+1):dp[i][0]=1
        for i in range(1,l+1):
            for j in range((totalSum+S)/2+1):
                if(j>=nums[i]):
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i]]
                else:
                    dp[i][j] = dp[i - 1][j]

        return dp[l][(totalSum+S)/2]

object=Solution()
print object.findTargetSumWays([1, 1, 1, 1, 1],3)
print object.findTargetSumWays([1,2,7,9,981],1000000000)
print object.findTargetSumWays([10],-10)
print object.findTargetSumWays([1,2,1],0)