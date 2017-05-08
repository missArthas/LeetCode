class Solution(object):
    def numberOfArithmeticSlices(self, A):
        """
        :type A: List[int]
        :rtype: int
        """
        sum=0
        added=0
        for i in range(2,len(A)):
            if(A[i-1]-A[i-2]==A[i]-A[i-1]):
                added+=1
                sum+=added
            else:
                added=0

        return sum

object=Solution()
print object.numberOfArithmeticSlices([1,2,3,4,7,1,2,3])