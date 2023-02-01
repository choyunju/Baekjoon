import java.util.*;
import java.io.*;

public class n_2075 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		
		int n = Integer.parseInt(reader.readLine());
	
		//내림차순으로 정렬
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			for(int j=0; j<n; j++) {
				queue.add(Integer.parseInt(s[j]));
			}
		}
		for(int i=0; i<n-1; i++) {
			queue.poll();
		}
		System.out.println(queue.poll());
	}
}
