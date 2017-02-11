/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/next-greater-element-i/
 */ 

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Stack<Integer> s = new Stack<Integer>(); 
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
        for(int i=0; i<=nums.length-1; i++){
            while(!s.isEmpty() && nums[i]>s.peek()) {
                int top = s.pop(); 
                hm.put(top,nums[i]); 
            }
            s.push(nums[i]); 
        }
        int[] res = new int[findNums.length];
        for(int i=0; i<=findNums.length-1; i++){
            res[i] = hm.containsKey(findNums[i]) ? hm.get(findNums[i]) : -1; 
        }
        return res; 
    }
}