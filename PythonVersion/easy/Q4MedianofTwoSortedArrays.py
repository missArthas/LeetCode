class Solution(object):
    target=0
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        l1 = len(nums1)
        l2 = len(nums2)
        if(l1==0 and l2==0):
            return 0.0

        if(l1==0):
            if l2 % 2 == 0:
                return (nums2[l2/2] + nums2[l2/2-1]) / 2.0
            else:
                return nums2[l2/2] * 1.0

        if(l2==0):
            if l1 % 2 == 0:
                return (nums1[l1/2] + nums1[l1/2-1]) / 2.0
            else:
                return nums1[l1/2] * 1.0
        self.target=(l1+l2)/2
        return self.result(nums1,nums2,0,l1)

    def result(self,nums1,nums2,s,t):

        p=(s+t)/2
        if(self.target-p-1>=0 and self.target-p<t):
            if(nums1[p]>=nums2[self.target-p-1] and nums1[p]<=nums2[self.target-p]):
                if (len(nums1)+len(nums2))%2==0:
                    return (nums1[p]+nums2[self.target-p-1])/2.0
                else:
                    return nums1[p]*1.0
        elif(self.target-p>=t):
            if (nums1[p] >= nums2[self.target - p - 1]):
                if (len(nums1)+len(nums2))%2==0:
                    return (nums1[p]+nums2[self.target-p-1])/2.0
                else:
                    return nums1[p]*1.0

        if (p<=s) :
            return self.result(nums2, nums1,0, len(nums2));

        if(nums1[p]<nums2[self.target-p-1]):
            return self.result(nums1, nums2,(s+t)/2, t);
        elif(nums1[p]>nums2[self.target-p-1]):
            return self.result(nums1,nums2,s/2,s)






object=Solution()
# print object.findMedianSortedArrays([1, 3,5,7,9],[2,4,6,8,10])
# print object.findMedianSortedArrays([1, 3],[2])
# print object.findMedianSortedArrays([1, 2],[3,4])
print object.findMedianSortedArrays([1],[2,3,4])

