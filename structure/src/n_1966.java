import java.io.*;
import java.util.*;

public class n_1966 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 풍선의 개수
		int n = Integer.parseInt(reader.readLine());	
		
		Deque<int[]> list = new ArrayDeque<>();
	
		String[] s = reader.readLine().split(" ");
	
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		
		for(int i=1; i<n; i++) {
			list.add(new int[] {(i+1), arr[i]});
		}
		
		StringBuilder result = new StringBuilder();
		result.append("1 ");
		int index = arr[0];
		while(!list.isEmpty()) {
			if(index > 0) { //양수이면
				for(int i=1; i<index; i++) {
					list.addLast(list.pollFirst());
				}
				int[] next = list.poll();
				index = next[1];
				result.append(next[0]+" ");
				
			}
			else { //음수이면
				for(int i=1; i<-index; i++) {
					list.addFirst(list.pollLast());
				}
				int[] next = list.pollLast();
				index = next[1];
				result.append(next[0] + " ");
				
			}
		}
		System.out.println(result.toString());
	}
}
