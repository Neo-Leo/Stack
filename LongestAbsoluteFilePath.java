/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/longest-absolute-file-path/
 */ 

public class LongestAbsoluteFilePath {
    public int lengthLongestPath(String input) {
        if(input == null || input.length() == 0) return 0; 
        Stack<Integer> s = new Stack<Integer>(); 
        int maxLen=0, currLen = 0; 
        for(String temp : input.split("\n")){
            if(temp == null || temp.length() == 0) continue; 
            int level = temp.lastIndexOf("\t")+1; 
            int len = temp.length()-temp.lastIndexOf("\t"); // Include the backshash   
            while(level < s.size()) { 
                currLen -= s.pop(); 
            }
            s.push(len);
            currLen += len; 
            if(temp.contains(".")) {
                maxLen = Math.max(maxLen,currLen);     
            }
        }
        return (maxLen == 0 ? 0 : maxLen-1); 
    }
}