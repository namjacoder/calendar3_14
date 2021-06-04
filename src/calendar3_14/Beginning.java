package calendar3_14;

import java.util.Scanner;

public class Beginning {
	public static void main(String args[]) {
		Beginning begin = new Beginning();
		begin.prompt();
	}
	
	public void prompt() {
		System.out.println("+------------------+");
		System.out.println("| 1.일정 등록");
		System.out.println("| 2.일정 검색");
		System.out.println("| 3.달력 보기");
		System.out.println("| h.도움말 q.종료");
		System.out.println("+------------------+");
		System.out.println("명령 (1, 2, 3, h, q)");
		System.out.print("> ");
		
		Scanner scanner = new Scanner(System.in);
		String select = scanner.next();
		
		Calendar cal = new Calendar();
		
		if (select.equals("1")) cal.setSchedule();
		else if (select.equals("2")) System.out.println("[일정 검색] 날짜를 입력하세요.");
		else if (select.equals("3")) System.out.println("");
		else if (select.equals("h")) System.out.println("도움말");
		else if (select.equals("q")) {
			scanner.close();
			System.out.println("Bye");
		}
	}
}
