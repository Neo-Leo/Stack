/*
 * Nilanshu Sharma
 * https://www.interviewbit.com/problems/redundant-braces/
 */ 

public class RedundantBraces {
	public int braces(String a) {
	    Stack<Character> s = new Stack<Character>(); 
	    if(a == null) return 0; 
	    for(int i=0; i<=a.length()-1; i++){
	        char ch = a.charAt(i);
	        if(ch == '(') {
	            s.push(ch);
	        } else if(ch == ')') {
	            if(!s.isEmpty() && s.peek() == '(') return 1; 
	            while(!s.isEmpty() && s.peek() != '(') s.pop(); 
	            s.pop(); 
	        } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/'){
	            s.push(ch);
	        }
	    }
	    return 0; 
	}
}