class Solution(object):
    def minimumTotal(self, triangle):
        """
        :type triangle: List[List[int]]
        :rtype: int
        """
        l=len(triangle)
        if(l==0):return 0
        dp=[triangle[l-1][i] for i in range(l)]
        for i in range(l-1):
            for j in range(l-i-1):
                dp[j]=triangle[l-i-2][j]+min(dp[j],dp[j+1])

        return dp[0]

object=Solution()
print object.minimumTotal([
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
])
print object.minimumTotal([
     [2]
])