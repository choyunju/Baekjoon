import java.util.*;
import java.io.*;

public class n_14425 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String s[] = reader.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		String[] set = new String[n];
		
		for(int i=0; i<n; i++) {
			set[i] = reader.readLine();
		}
		int result = 0;
		for(int i=0; i<m; i++) {
			String input = reader.readLine();
			if(Arrays.asList(set).contains(input)) {
				result++;
			}
		}
		System.out.print(result);
		
		
	}
}
