import java.util.*;
import java.io.*;

public class n_2164 {
	public static void main(String args[]) throws IOException{
			int result;
			Queue<Integer> queue = new LinkedList<Integer>();
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			
			for(int i=1; i<=n; i++) {
				queue.add(i);
			}
			
			while(queue.size() != 1) {
				queue.poll();
				queue.add(queue.poll());
			}
			result = queue.poll();
			System.out.print(result);
			
			scanner.close();
	}
}
