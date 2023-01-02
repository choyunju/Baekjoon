import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class n_10866 {
	public static void main(String[] args) throws IOException {
		Deque<String> deque = new ArrayDeque<String>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(reader.readLine());
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			String cmd = s[0];
			
			
			if(cmd.equals("push_front")) {
				deque.addFirst(s[1]);
			}
			else if(cmd.equals("push_back")) {
				deque.addLast(s[1]);
			}
			else if(cmd.equals("pop_front")) {
				if(deque.isEmpty()) {
					result.append("-1");
				}
				else {
					result.append(deque.pollFirst());
				}
				result.append("\n");
			}
			else if(cmd.equals("pop_back")) {
				if(deque.isEmpty()) {
					result.append("-1");
				}
				else {
					result.append(deque.pollLast());					
				}
				result.append("\n");
			}
			else if(cmd.equals("size")) {
				result.append(deque.size());
				result.append("\n");
			}
			else if(cmd.equals("empty")) {
				if(deque.isEmpty()) {
					result.append("1");
				}
				else {
					result.append("0");
				}
				result.append("\n");
			}
			else if(cmd.equals("front")) {
				if(deque.isEmpty()) {
					result.append("-1");
				}
				else {
					result.append(deque.peekFirst());
				}
				result.append("\n");
			}
			else if(cmd.equals("back")) {
				if(deque.isEmpty()) {
					result.append("-1");
				}
				else {
					result.append(deque.peekLast());
				}
				result.append("\n");
			}
		}		
		System.out.println(result);
	}
}
