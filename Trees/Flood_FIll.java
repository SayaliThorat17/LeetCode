class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int C = image[sr][sc];

       if(C!=newColor) DFScolor(image,sr,sc,newColor,C);
        return image;
    }

     public void DFScolor(int[][] image, int sr, int sc,int newColor,int C) {
         if(image[sr][sc] == C)
         {
            image[sr][sc] = newColor;

            if(sr>=1) DFScolor(image,sr-1,sc,newColor,C);
            if(sc>=1) DFScolor(image,sr,sc-1,newColor,C);
            if(sr+1<image.length) DFScolor(image,sr+1,sc,newColor,C);
            if(sc+1<image[0].length) DFScolor(image,sr,sc+1,newColor,C);

         }
     }
}
