class Solution(object):
    def minDistance(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: int
        """
        l1=len(word1)
        l2=len(word2)
        m=max(l1,l2)
        dp= [[0 for i in range(m+1)] for i in range(m+1)]
        for i in range(m+1):
            dp[i][0]=i
            dp[0][i]=i
        for i in range(l1):
            for j in range(l2):
                d=dp[i+1][j]+1
                r=dp[i][j+1]+1
                if(word1[i]==word2[j]):
                    c=dp[i][j]
                else:
                    c=dp[i][j]+1
                dp[i+1][j+1]=min(d,r,c)

        return dp[l1][l2]




object=Solution()
print object.minDistance("AGTCTGACGC","AGTAAGTAGGC")
