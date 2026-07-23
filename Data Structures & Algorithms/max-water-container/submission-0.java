class Solution {
    public int maxArea(int[] heights) {
    int rigthPillar = heights.length - 1;
            int leftPillar = 0;
            int area = 0;


            for (int i = 0; i < heights.length; i++){

                
                int temp = (rigthPillar - leftPillar) * Math.min(heights[leftPillar], heights[rigthPillar]);
                if (temp > area){
                    area = temp;
                }
               if (heights[leftPillar] < heights[rigthPillar]) {
                    leftPillar++;
                } else {
                    rigthPillar--;
                }

            }

            return area;
        }
}
