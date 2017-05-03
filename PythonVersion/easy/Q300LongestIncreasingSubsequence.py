class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=len(nums)
        if(l==0):
            return 0;
        matrix=[1 for i in range(l)]
        for i in range(1,l):
            for j in range(0,i):
                if(nums[i]>nums[j]):
                    matrix[i]=max(matrix[i],matrix[j]+1)

        return max(matrix)
object=Solution()
print object.lengthOfLIS([10, 9, 2, 5, 3, 7, 101, 18])


class Solution2(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums2=sorted(nums)
        l1=len(nums)
        l2=0
        while(l2<len(nums2)-1):
            if(nums2[l2]==nums2[l2+1]):
                del nums2[l2]
            else:l2+=1
        l2=len(nums2)
        matrix = [[0 for i in range(l2+1)] for j in range(l1+1)]
        for i in range(l1):
            for j in range(l2):
                if(nums[i]==nums2[j]):
                    matrix[i+1][j+1]=matrix[i][j]+1
                else:
                    matrix[i+1][j+1]=max(matrix[i+1][j],matrix[i][j+1])
        return matrix[l1][l2]

