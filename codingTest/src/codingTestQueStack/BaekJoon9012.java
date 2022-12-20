package codingTestQueStack;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon9012 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			Stack stack = new Stack();
			String s = sc.next();
			
			for (int j=0; j < s.length(); j++) {
				if(s.charAt(j)=='(') {
					stack.push('(');
				}else if(s.charAt(j) == ')') {
					try {
						stack.pop();
					}catch(Exception e) {
						stack.push("fair");
						break;
					}
				}
			}
			
			if(stack.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		}
	}
}
