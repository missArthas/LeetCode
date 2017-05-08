class Solution(object):
    def findTargetSumWays(self, nums, S):
        """
        :type nums: List[int]
        :type S: int
        :rtype: int
        """
        totalSum=sum(nums)
        l=len(nums)
        dp=[[0 for j in range(totalSum+1)] for i in  range(l+1)]
        dp[0][0]=1
        if(totalSum+S%2==1):return 1
        for i in range(1,l+1):
            for j in range((totalSum+S)/2):
                dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i]]

        return dp[l][(totalSum+S)/2]

object=Solution()
print object.findTargetSumWays([1, 1, 1, 1, 1],3)