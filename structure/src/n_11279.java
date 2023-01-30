import java.util.*;
import java.io.*;

public class n_11279 { 
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		
		int n = Integer.parseInt(reader.readLine());
		
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(reader.readLine());
			if(x==0) {
				if(queue.size()==0) {
					st.append("0" + "\n");
				}
				else {
					st.append(queue.poll() + "\n");
				}
			}
			else {
				queue.add(x);
			}
		}
		System.out.println(st);
	}
}
