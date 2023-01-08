import java.io.*;
import java.util.*;

public class n_10799 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = reader.readLine().split("");
		Stack<String> stack = new Stack<>();
		
		int result = 0;
	
		for(int i=0; i<s.length; i++) {
			if(s[i].equals("(")) {
				if(s[i+1].equals(")")) {//레이저일 경우
					if(!stack.empty()) {
						result = result + stack.size();
					}
					i++;
				}
				else if(s[i+1].equals("(")) {  //쇠막대기일 경우
					stack.add(s[i]); 
					result =result + 1;
				}
			}
			else if(s[i].equals(")")) {
				if(!stack.empty()) {
					stack.pop();
				}
			}
		}
		System.out.println(result);
	}
}
