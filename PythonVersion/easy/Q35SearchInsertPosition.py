class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        for i in range(len(nums)):
            if(nums[i]>=target):return i

        return len(nums)
object=Solution()
print object.searchInsert([1,3,5,6],0)