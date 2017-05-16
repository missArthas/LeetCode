class Solution(object):

    dp=[]
    def func(self,start,end,nums):
        if(start==end):
            return nums[start]
        if(self.dp[start][end]==None):
            self.dp[start][end] = max(nums[start] - self.func(start + 1, end, nums),
                                      nums[end] - self.func(start, end - 1, nums))
        return self.dp[start][end]

    def PredictTheWinner(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        l=len(nums)
        self.dp=[[None for i in range(l)] for j in range(l)]
        for i in range(l):
            self.dp[i][i]=nums[i]
        if(self.func(0,l-1,nums)>=0):
            return True
        else:
            return False



object=Solution()
print object.PredictTheWinner([1,5,233,7])
print object.PredictTheWinner([1,5,2])