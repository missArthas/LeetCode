/**
 * Created by shhuang on 2017/3/12.
 */
public class Q463IslandPerimeter {
    public static void main(String[] args) {
        Q463IslandPerimeter object =new Q463IslandPerimeter();
        int[][] gird=
                {{0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0}};
        int result=object.islandPerimeter(gird);
        System.out.println(result);
    }

    public int islandPerimeter(int[][] grid) {
        int result=0;
        int island=0;
        int neighbour=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    island++;
                    if(i<grid.length-1&&grid[i+1][j]==1) neighbour++;
                    if(j<grid[i].length-1&&grid[i][j+1]==1) neighbour++;
                }
            }
        }
        return island*4-neighbour*2;
    }
}
