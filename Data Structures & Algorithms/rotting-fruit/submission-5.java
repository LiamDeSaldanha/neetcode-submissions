class Solution {
    public int orangesRotting(int[][] grid) {
        int time = 0;
        int fresh = 0;
        Queue<List<Integer>> q = new LinkedList<>();

        int row = grid.length;
        int col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    q.offer(list);
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }

        List<List<Integer>> tmp = new ArrayList<>();
        int min = 0;
        while (!q.isEmpty()) {
            List<Integer> tmp2 = q.poll();
            int i = tmp2.get(0);
            int j = tmp2.get(1);

            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                grid[i - 1][j] = 2;
                List<Integer> l = new ArrayList<>();
                l.add(i - 1);
                l.add(j);
                tmp.add(l);
                fresh--;
            }
            if (i + 1 < row && grid[i + 1][j] == 1) {
                grid[i + 1][j] = 2;
                List<Integer> l = new ArrayList<>();
                l.add(i + 1);
                l.add(j);
                fresh--;
                tmp.add(l);
            }
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                grid[i][j - 1] = 2;
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j - 1);
                fresh--;
                tmp.add(l);
            }
            if (j + 1 < col && grid[i][j + 1] == 1) {
                grid[i][j + 1] = 2;
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j + 1);
                fresh--;
                tmp.add(l);
            }
            if (q.isEmpty()) {
                min++;
                System.out.print(min);
                for (int k = 0; k < tmp.size(); k++) {
                    q.offer(tmp.get(k));
                }
                tmp.clear();
            }
        }
      
        if (fresh > 0)
            return -1;
        return min - 1;
    }
}
