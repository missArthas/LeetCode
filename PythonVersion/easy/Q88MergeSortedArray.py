class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        i=0
        j=0
        t1=[]
        while(i<m and j<n):
            if(nums1[i]<=nums2[j]):
                t1.append(nums1[i])
                i+=1
            else:
                t1.append(nums2[j])
                j+=1

        while(i<m):
            t1.append(nums1[i])
            i += 1

        while(j<n):
            t1.append(nums2[j])
            j += 1
        nums1=t1
        print nums1


object=Solution()
object.merge([],0,[4,6,8],3)
object.merge([0],0,[1],1)