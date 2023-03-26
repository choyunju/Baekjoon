import java.util.*;
import java.io.*;

public class n_1991 {
	static char[][] node;
	static int n;
	static StringBuilder result = new StringBuilder();
	
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(reader.readLine());  //노드의 개수
		node = new char[n][2];  //n개의 2차원 배열 생성
		
		for(int i=0; i<n; i++) {
			String[] s = reader.readLine().split(" ");
			
			char root = s[0].charAt(0);
			node[(int)root - 65][0] = s[1].charAt(0);
			node[(int)root - 65][1] = s[2].charAt(0);
		
		}
		preOrder(0);  //A가 루트노드이므로 인덱스로 사용하기 위해 A(65) - 65 한 값을 넣는다. 
		result.append("\n");
		inOrder(0);
		result.append("\n");
		postOrder(0);
		System.out.println(result);
	}
	
	public static void preOrder(int index) {
		char c = (char)(index+65);
		if(node[index][0] == '.' && node[index][1] == '.') {  //해당 노드의 왼쪽, 오른쪽 자식들이 없다면 순회X
			result.append(c);
		}
		else {
			result.append(c);
			if(node[index][0] != '.') {  //왼쪽 자식노드가 존재한다면
				int left = (int)node[index][0];
				preOrder(left - 65);
			}
			if(node[index][1] != '.') {  //오른쪽 자식노드가 존재한다면
				int right = (int)node[index][1];
				preOrder(right - 65);
			}
		}
	}
	
	public static void inOrder(int index) {
		char c = (char)(index+65);
		if(node[index][0] == '.' && node[index][1] == '.') {  //해당 노드의 왼쪽, 오른쪽 자식들이 없다면 순회X
			result.append(c);
		}
		else {
			if(node[index][0] != '.') {  //왼쪽 자식노드가 존재한다면
				int left = (int)node[index][0];
				inOrder(left - 65);
			}
			result.append(c);
			if(node[index][1] != '.') {  //오른쪽 자식노드가 존재한다면
				int right = (int)node[index][1];
				inOrder(right - 65);
			}
		}
	}
	
	public static void postOrder(int index) {
		char c = (char)(index+65);
		if(node[index][0] == '.' && node[index][1] == '.') {  //해당 노드의 왼쪽, 오른쪽 자식들이 없다면 순회X
			result.append(c);
		}
		else {
			if(node[index][0] != '.') {  //왼쪽 자식노드가 존재한다면
				int left = (int)node[index][0];
				postOrder(left - 65);
			}
			if(node[index][1] != '.') {  //오른쪽 자식노드가 존재한다면
				int right = (int)node[index][1];
				postOrder(right - 65);
			}
			result.append(c);
		}
	}
}
