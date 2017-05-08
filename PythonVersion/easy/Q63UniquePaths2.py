class Solution(object):
    def uniquePathsWithObstacles(self, obstacleGrid):
        """
        :type obstacleGrid: List[List[int]]
        :rtype: int
        """
        if(obstacleGrid==None):return 0
        m=len(obstacleGrid)
        n=len(obstacleGrid[0])
        if(obstacleGrid[0][0]==1 or obstacleGrid[m-1][n-1]==1):return 0
        dp=[[0 for j in range(n+1)] for i in range(m+1)]
        dp[0][1]=1

        for i in range(1,m+1):
            for j in range(1,n+1):
                right = dp[i][j - 1]
                down = dp[i - 1][j]
                if(i-2>=0 and obstacleGrid[i-2][j-1]==1):
                    down=0
                if(j-2>=0 and obstacleGrid[i-1][j-2]==1):
                    right=0
                dp[i][j]=down+right
        return dp[m][n]

object=Solution()
print object.uniquePathsWithObstacles([
  [0,0,0],
  [0,1,0],
  [0,0,0]
])
print object.uniquePathsWithObstacles([
  [0,0,0]
])
print object.uniquePathsWithObstacles([
  [0,0,1]
])