import java.util.*;
import java.io.*;

public class n_1158 {
	public static void main(String[ ]args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(reader.readLine());
		StringBuilder result = new StringBuilder();
		
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		result.append("<");
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		while(queue.size() != 1) {
			for(int i=0; i<k-1; i++) {
				queue.offer(queue.poll()); //queue의 맨 앞을 뺀 후 다시 뒤에 추가한다. -> 2번 반복
			}
			result.append(queue.poll());
			result.append(", ");
		}
		result.append(queue.poll());
		result.append(">");
		System.out.println(result);
	}
}
