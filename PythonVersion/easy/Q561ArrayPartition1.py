class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        return sum(nums[::2])

object=Solution()
print object.arrayPairSum([2,1,3,4,8,7,5,6])