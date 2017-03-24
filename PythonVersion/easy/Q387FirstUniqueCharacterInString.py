class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        map={}
        for c in s:
            if(map.has_key(c)):
                map[c]=map[c]+1
            else:
                map[c]=1

        index=0
        for c in s:
            if(map[c]==1):return index
            index=index+1
        return -1

object=Solution()
print object.firstUniqChar("leetcode")