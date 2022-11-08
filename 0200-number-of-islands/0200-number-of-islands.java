class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        int left = grid.length;
        int right = grid[0].length;
        int sum = 0;
        for(int i=0;i<left;i++){
            for(int j=0;j<right;j++){
                if(grid[i][j] == '1'){
                    bfs(grid, i, j );
                    sum++;
                }
                
            }
        }
        return sum;
    }
    
    public void bfs(char[][] grid, int start, int end){
        if(start < 0 || start>=grid.length || end < 0 || end >= grid[0].length || grid[start][end] != '1'){
            return;
        }
           grid[start][end] = '2'; // visited
           bfs(grid,start+1, end);
           bfs(grid,start, end+1);
           bfs(grid,start, end-1);
           bfs(grid,start-1, end);
          
           
    }
}