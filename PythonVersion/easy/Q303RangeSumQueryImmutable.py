class NumArray(object):
    def __init__(self, nums):
        """
        :type nums: List[int]
        """
        l=len(nums)
        self.sum=nums
        for i in range(1,len(nums)):
            self.sum[i]+=self.sum[i-1]

    def sumRange(self, i, j):
        """
        :type i: int
        :type j: int
        :rtype: int
        """
        if(i<=0):
            return self.sum[j]
        else:
            return self.sum[j]-self.sum[i-1]


obj = NumArray([-2, 0, 3, -5, 2, -1])
print obj.sumRange(0,5)