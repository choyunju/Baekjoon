import java.util.Stack;
import java.io.*;

public class n_1935 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine()); //피연산자의 개수
		String formula = reader.readLine(); //후위표기식
		
		//알파벳에 해당되는 숫자
		int[] value = new int[n]; 
		for(int i=0; i<n; i++) {
			value[i] = Integer.parseInt(reader.readLine());
		}
		
		Stack<Double> stack = new Stack<>(); //피연산자 스택
		for(int i=0; i<formula.length(); i++) {
			char c = formula.charAt(i);
			if(c >= 'A' && c <= 'Z') {  //피연산자가 나오면
				double d = value[c - 'A'];
				stack.push(d);
			}
			else {
				double n2 = stack.pop();
				double n1 = stack.pop();
				if(c == '+') {
					stack.push(n1 + n2);
				}
				else if(c == '-') {
					stack.push(n1 - n2);
				}
				else if(c == '*') {
					stack.push(n1 * n2);
				}
				else if(c == '/') {
					stack.push(n1 / n2);
				}
			}
		}
		System.out.printf("%.2f", stack.pop());
	}
}
