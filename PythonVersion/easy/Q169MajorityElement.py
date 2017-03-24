class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result=sorted(nums)
        return result[len(nums)/2]

object=Solution()
nums=[2,1,3,2,2]
print object.majorityElement(nums)