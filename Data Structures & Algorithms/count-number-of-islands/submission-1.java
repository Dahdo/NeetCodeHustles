class Solution {

    public static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        int nRows = grid.length;
        int nCols = grid[0].length;
        int numIslands = 0;

        for (int r = 0; r < nRows; r++) {
            for (int c = 0; c < nCols; c++) {
                if (grid[r][c] == '1') {
                    numIslands++;
                    bfs(grid, r, c);
                }
            }
        }

        return numIslands;
    }

    public void bfs(char[][] grid, int row, int col) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int []{row, col});
        grid[row][col] = '0'; // visited

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int r = node[0];
            int c = node[1];

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];
                if (nr >= 0 && nr < grid.length &&
                    nc >= 0 && nc < grid[0].length && grid[nr][nc] == '1') {
                    q.add(new int[] {nr, nc});
                    grid[nr][nc] = '0'; // visited
                }
            }
        }
    }
}
