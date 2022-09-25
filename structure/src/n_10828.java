import java.util.*;

public class n_10828 {
	public static void main(String[] Args) {
		//명령어 개수 입력 받기
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine(); //입력버퍼를 비워주기
		
		//stack 선언: Stack<타입> 변수명 = new Stack<>()
		Stack<String> stack = new Stack<>();
		
		//최종 결과를 보여주기 위해 out변수에 명령어를 입력 받을 때마다 계속 append해준다.
		StringBuilder out = new StringBuilder();

		
		//n개의 명령어 개수만큼 명령어 입력 받기
		for(int i=0; i<n; i++) {
			String[] s = scanner.nextLine().split(" ");
			String cmd = s[0];
			if(cmd.equals("push")) {
				stack.add(s[1]);
			}
			else if(cmd.equals("pop")) {
				if(stack.empty()) {
					out.append("-1");
				}
				else {
					out.append(stack.pop());
				}
				out.append("\n");
			}
			else if(cmd.equals("size")) {
				out.append(stack.size());
				out.append("\n");
			}
			else if(cmd.equals("top")) {
				if(stack.isEmpty()) {
					out.append("-1");
				}
				else {
					out.append(stack.peek());
				}
				out.append("\n");
			}
			else if(cmd.equals("empty")) {
				if(stack.isEmpty()) {
					out.append("1");
				}
				else {
					out.append("0");
				}
				out.append("\n");
			}
		}
		System.out.print(out);
		scanner.close();
	}
}
