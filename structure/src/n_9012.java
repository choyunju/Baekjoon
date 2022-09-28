import java.util.*;

//올바른 괄호문제
public class n_9012 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			Stack<Character> stack = new Stack<>();
			String s = scanner.next();
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j) == '(') {
					stack.add(s.charAt(j));
				}
				else if(s.charAt(j) == ')') {
					if(stack.isEmpty()) {
						stack.add(')');
					}
					if(stack.peek() == '(') {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()) {
				result.append("YES\n");
			}
			else {
				result.append("NO\n");
			}	
		}
		System.out.println(result);
		scanner.close();
	}
}
