/*
 * Nilanshu Sharma
 * https://leetcode.com/problems/ternary-expression-parser/
 */ 

public class TernaryExpressionParser {
    public String parseTernary(String exp) {
        if(exp == null || exp.length() == 0) {return "";}
        int n = exp.length();
        int i=n-1; 
        Stack<Character> s = new Stack<Character>(); 
        while(i >= 0) {
            char ch = exp.charAt(i);  
            if(ch == '?') { // A valid exp right there. 
                // Look back, and Pop
                char temp1 = s.pop(); 
                char temp2 = s.pop(); 
                if(exp.charAt(i-1) == 'T') s.push(temp1); 
                else s.push(temp2); 
                i--; 
            } else if(ch != ':') {
                s.push(ch); 
            }
            i--; 
        }
        return s.pop().toString();  
    }
}