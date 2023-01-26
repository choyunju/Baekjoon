import java.util.*;
import java.io.*;

public class n_1620 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] s = reader.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		HashMap<String, Integer> map_str = new HashMap<>();
		HashMap<Integer, String> map_int = new HashMap<>();
		
		for(int i=0; i<n; i++) {
			String name = reader.readLine();
			map_int.put(i, name);
			map_str.put(name, i);
		}
		
		for(int i=0; i<m; i++) {
			String q = reader.readLine();
			if(isNum(q)) {
				sb.append(map_int.get(Integer.parseInt(q)-1) + "\n");	
			}
			else {
				sb.append((map_str.get(q)+1) + "\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean isNum(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
