class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map=nums[:]

        if (len(nums) == 0):
            return 0
        if(len(nums)==1):
            return nums[0]
        elif(len(nums)==2):
            return max(nums[0],nums[1])
        map[1]=max(nums[0],nums[1])
        for i in range(2,len(nums)):
            map[i]=max(nums[i]+map[i-2],map[i-1])

        return map[-1]

object=Solution()
print object.rob([1,2,3,4,5,6])