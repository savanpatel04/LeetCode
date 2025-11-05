class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
        int n=grid.length;
	int y_0=0, y_1=0, y_2=0, outside_0=0, outside_1=0, outside_2=0;
	int half = n/2;

	for(int i=0; i<n; i++){
		for(int j=0; j<n; j++){
			if((i<half && (i==j || n-j-1==i)) || (i>=half && j == half)){
				if(grid[i][j] == 0) y_0++;
				else if(grid[i][j] == 1) y_1++;
				else y_2++;
			}else {
				if(grid[i][j] == 0) outside_0++;
				else if(grid[i][j] == 1) outside_1++;
				else outside_2++;
			}
		}
	}

	int ans0 = y_1+y_2 + outside_0 + Math.min(outside_1,outside_2);
	int ans1 = y_0+y_2 + outside_1 + Math.min(outside_0,outside_2);
	int ans2 = y_0+y_1 + outside_2 + Math.min(outside_0,outside_1);

	return Math.min(ans0, Math.min(ans1, ans2));
    }
}