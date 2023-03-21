import java.util.*;
import java.io.*;

public class n_11725 {
	static int N;
	static int[] parent;
	static boolean[] isVisit;
	static ArrayList<Integer> list[];
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token;
		N = Integer.parseInt(reader.readLine()); //노드의 개수
		//n+1을 하는 이유 : 노드의 값이 1부터 시작하기 때문에 인덱스와 노드의 수를 일치시키기 위해
		parent = new int[N+1];  //부모노드 저장
		isVisit = new boolean[N+1];
		
		list = new ArrayList[N+1]; //노드 저장
		
		//한 노드에 여러노드가 연결될 수 있으므로
		for(int i=0; i<N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		//연결된 노드 값들 입력받기
		for(int i=0; i<N-1; i++) {
			token = new StringTokenizer(reader.readLine());  //입력 받은 숫자를 token으로 저장
			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());
			
			list[a].add(b);
			list[b].add(a);
		}
		dfs(1);
		
		for(int i=2; i<parent.length; i++) {
			System.out.println(parent[i]);
		}
		
	}
	public static void dfs(int index) {
		isVisit[index] = true;
		for(int i:list[index]) {
			if(!isVisit[i]) {
				parent[i] = index;
				dfs(i);
			}
		}
	}
}
