public int getWaysOfScoreDp(int[] points, int score) {
 2     if(points == null || score < 0) {
 3         return 0;
 4     }
 5     int[][] T = new int[score + 1][points.length + 1];
 6     for(int j = 0; j <= points.length; j++) {
 7         T[0][j] = 1;
 8     }
 9     for(int i = 1; i <= score; i++) {
10         T[i][0] = 0;
11     }
12     for(int i = 1; i <= score; i++) {
13         for(int j = 1; j <= points.length; j++) {
14             if(points[j - 1] <= i) {
15                 T[i][j] = T[i - points[j - 1]][j] + T[i][j - 1];
16             }
17             else {
18                 T[i][j] = T[i][j - 1];
19             }
20         }
21     }
22     return T[score][points.length];
23 }