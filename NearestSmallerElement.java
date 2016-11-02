/*
 * Nilanshu Sharma
 * https://www.interviewbit.com/problems/nearest-smaller-element/
 */ 

public class NearestSmallerElement {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        if(arr == null) return list; 
        Stack<Integer> s = new Stack<Integer>(); 
        for(int curr : arr){
            while(!s.isEmpty() && (s.peek() >= curr)) s.pop(); 
            if(s.isEmpty()) {
                list.add(-1);
            } else {
                list.add(s.peek());
            }
            s.push(curr);
        }
        return list;
    }
}