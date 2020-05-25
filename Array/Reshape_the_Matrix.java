class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int x = nums.length, y = nums[0].length;

        if (r*c > x*y)
            return nums;

        int[][] matrix = new int[r][c];

        int rows=0, cols=0;

        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                if(cols==c)
                {
                    cols=0;
                    rows++;
                }

                if(rows==r)
                    break;

                matrix[rows][cols]=nums[i][j];
                cols++;
            }
        }

        return matrix;
    }
}



//Another SOlution
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int x = nums.length, y = nums[0].length;

        if (r*c > x*y || nums.length==0)
            return nums;

        int[][] matrix = new int[r][c];

        int cnt=0;

        for(int i=0;i<x;i++)
        {
            for(int j=0;j<y;j++)
            {
                matrix[cnt/c][cnt%c]=nums[i][j];
                cnt++;
            }
        }

        return matrix;
    }
}
