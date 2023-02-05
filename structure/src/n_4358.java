import java.util.*;
import java.io.*;

public class n_4358 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s;
		int total = 0;
		Map<String, Integer> map = new HashMap<>();
		
		while((s = reader.readLine()) != null) {
			total++;
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		List<String> list = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String tree = entry.getKey();
			list.add(tree);
		}
		Collections.sort(list);  //알파벳 순서대로 정렬
		for(String tree : list) {
			int count = map.get(tree) * 100;
			sb.append(tree + " " + String.format("%.4f", (double)count/(double)total) + "\n");
		}
		System.out.print(sb);
	}
}