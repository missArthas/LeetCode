class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        result=[]
        if(len(nums1)<len(nums2)):
            list1=sorted(nums1)
            list2=sorted(nums2)
        else:
            list1=sorted(nums2)
            list2=sorted(nums1)

        indexj=0
        i=0
        while(i<len(list1)):
            if(indexj>=len(list2)):return result
            for j in range(indexj,len(list2)):
                if (indexj >= len(list2)): return result
                if (i>=len(list1)): return result
                if(list2[j]<list1[i]):
                    indexj+=1
                    continue
                elif(list2[j]==list1[i]):
                    result.append(list1[i])
                    i+=1
                    indexj+=1
                else:
                    i+=1
                    break

        return result

object=Solution();
list1=[1,2,2,1,3,2,5]
list2=[2,2,1,3,3,3,3,4,5]
print object.intersect([1],[1,1])