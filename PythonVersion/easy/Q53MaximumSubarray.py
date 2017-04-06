class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(nums==None):return 0

        table=[0]*len(nums)
        result=nums[0]
        if(nums[0]>=0):table[0]=nums[0]
        else:table[0]=0
        for i in range(1,len(nums)):
            if (nums[i]+table[i-1] > result): result = nums[i]+table[i-1]

            if(nums[i]+table[i-1]>0):
                table[i]=nums[i]+table[i-1]
            else:
                table[i]=0

        return result


object=Solution()
print object.maxSubArray([-2,1,-3,4,-1,2,1,-5,4])