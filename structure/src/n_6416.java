import java.util.*;
import java.io.*;

public class n_6416 {
	public static void main(String[] args) throws IOException{
		Scanner scanner = new Scanner(System.in);
		//<노드, 해당 노드의 진입 간선>
		//해당 노드의 진입 간선이 0일 경우, 루트 노드
		HashMap<Integer, Integer> vertex;  
		int count = 1; //case의 개수를 센다
		
		while(true) {
			vertex = new HashMap<>();
			int edge = 0; //간선의 개수
			while(true) {
				int start = scanner.nextInt();
				int end = scanner.nextInt();
				
				if(start == -1 && end == -1) {
					return;  //입력 종료
				}
				else if(start == 0 && end == 0) {
					break;  //case 종료
				}
				
				vertex.put(start, vertex.getOrDefault(start, 0));
				vertex.put(end, vertex.getOrDefault(end, 0) + 1);
				edge++;
			}
			
			int root = 0;  //루트노드의 개수
			boolean isTrue = true;
			Iterator<Integer> key = vertex.keySet().iterator();
			while(key.hasNext()) {
				int k = key.next();
				if(vertex.get(k) == 0) {  //key에 대한 value가 0이면 해당 key는 루트노드
					root++;
				}
				else if(vertex.get(k) > 1) { //key에 대한 진입 간선이 2개 이상일 경우
					isTrue = false;
					break;
				}
			}
			
			if(vertex.size() == 0) {
				System.out.println("Case " + count + " is a tree.");
	
			}
			else if(isTrue && root == 1 && edge == vertex.size() - 1) {
				System.out.println("Case " + count + " is a tree.");
			}
			else {
				System.out.println("Case " + count + " is not a tree.");
			}
			count++;
		}	
	}
}
