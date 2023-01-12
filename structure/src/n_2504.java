import java.util.*;
import java.io.*;

public class n_2504 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = reader.readLine().split("");
		StringBuilder sb = new StringBuilder();
		Stack<String> stack = new Stack<>();
		
		int result = 0;
		int value = 1;
		for(int i=0; i<s.length; i++) {
			if(s[i].equals("(")) {
				stack.add(s[i]);
				value *= 2;  //( = 2
			}
			else if(s[i].equals("[")) {
				stack.add(s[i]);
				value *= 3;  //[ = 3
			}
			else if(s[i].equals(")")) {
				if(stack.isEmpty() || !stack.peek().equals("(")) {
					result = 0;
					break;
				}
				else if(s[i-1].equals("(")) {
					result += value;
				}
				stack.pop();
				value /= 2;
			}
			else if(s[i].equals("]")) {
				if(stack.isEmpty() || !stack.peek().equals("[")) {
					result = 0;
					break;
				}
				else if(s[i-1].equals("[")) {
					result += value;
				}
				stack.pop();
				value /= 3;
			}
		}
		if(!stack.isEmpty()) {
			sb.append(0).append("\n");
		}
		else {
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
