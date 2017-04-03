/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/next-greater-element-ii/
 */ 

public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<Integer>(); 
        int n = nums.length; 
        int[] nge = new int[n];
        Arrays.fill(nge,-1);
        for(int i=0; i<n; i++){
            if(s.isEmpty() || nums[i] <= nums[s.peek()]) {
                s.push(i);
            } else {
                while(!s.isEmpty() && nums[i] > nums[s.peek()]) {
                    nge[s.pop()] = nums[i]; 
                }
                s.push(i); 
            }
        }
        int i=0;
        while(!s.isEmpty() && i<s.peek()) {
            if(nums[i] > nums[s.peek()]) {
                nge[s.pop()] = nums[i];
            } else {
                i++;
            }
        }
        
        return nge; 
    }
}