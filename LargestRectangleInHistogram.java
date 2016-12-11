/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 */ 

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0)
            return 0; 
        Stack<Integer> s = new Stack<Integer>();
        int i=0, max_area = Integer.MIN_VALUE, curr_area=0, top=0; 
        //Keep track of the smaller bar on the left hand side of current bar. 
        
        while(i <= heights.length-1){
            // 
            if(s.isEmpty() || heights[i] > heights[s.peek()]){
                s.push(i++);
            } else {
                top = s.pop();
                curr_area = heights[top]*(s.isEmpty() ? i : i - s.peek() -1);
                max_area = Math.max(curr_area, max_area);
            }
        }
        
        while(!s.isEmpty()){
            top = s.pop();
            curr_area = heights[top]*(s.isEmpty() ? i : i - s.peek() - 1);
            max_area = Math.max(curr_area, max_area);
        }
        
        return max_area; 
    }
}