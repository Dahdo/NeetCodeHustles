class Solution {
    public int numIslands(char[][] grid) {
        int nRows = grid.length;
        int nCols = grid[0].length;
        int numIslands = 0;

        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                if (grid[r][c] == '1') {
                    numIslands++;
                    dfs(grid, r, c);
                }
            }
        }

        return numIslands;
    }

    public void dfs(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length ||
        col < 0 || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}
